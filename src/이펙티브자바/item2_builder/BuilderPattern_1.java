package 이펙티브자바.item2_builder;

public class BuilderPattern_1 {
    /* 빌더 패턴
     *  빌더 패턴은 복잡한 객체의 생성을 단계적으로 수행하며, 설정 메서드 체인을 사용하여 객체를 구성하는 패턴이다.
     *  이 패턴은 객체를 불변하게 만들 수 있고, 객체 생성 과정을 훨씬 명확하게 만든다.
     * */
    private int par1;
    private String par2;
    private boolean par3;

    private BuilderPattern_1(Builder builder) {
        this.par1 = builder.par1;
        this.par2 = builder.par2;
        this.par3 = builder.par3;
    }

    public static class Builder {
        private int par1;
        private String par2;
        private boolean par3;

        public Builder(int par1) {
            this.par1 = par1;
        }

        public Builder withPar2(String par2) {
            this.par2 = par2;
            return this;
        }

        public Builder withPar3(boolean par3) {
            this.par3 = par3;
            return this;
        }

        public BuilderPattern_1 build() {
            return new BuilderPattern_1(this);

            /* 빌더 패턴
            *
            * 장점 :
            * - 객체의 불변성을 보장할 수 있으므로 스레드 안전하게 사용할 수 있다.
            * - 가독성이 우수하며, 코드가 간결하고 명확해진다.
            * - 선택적 매개변수를 처리하는데 효과적이다.
            *
            * 단점 :
            * - 구현이 다소 복잡하며, 빌더 클래스를 작성해야한다.
            *
            * 정리:
            * 점층적 방식 패턴은 간단하고 직관적이지만, 선택적인 매개변수가 많은 경우에는 유지 관리가 어려울 수 있습니다.
            * 자바 빈즈 패턴은 설정이 쉽고 유연하며, 필요한 속성만 설정할 수 있으나, 객체의 무결성을 보장하기 어려울 수 있습니다.
            * 빌더 패턴은 객체의 불변성과 가독성을 보장하며 선택적 매개변수를 처리하기에 효과적이지만, 빌더 클래스를 작성해야 하므로 코드가 조금 복잡해질 수 있습니다.
            *
            * */
        }
    }
}
