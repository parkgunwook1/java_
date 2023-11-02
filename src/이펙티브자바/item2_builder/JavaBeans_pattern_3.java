package 이펙티브자바.item2_builder;

public class JavaBeans_pattern_3 {
    /* 자바 빈즈 패턴
    * 자바 빈즈 패턴은 매개변수 없는 생성자로 객체를 생성한 후 , setter 메서드를 사용하여 객체의
    * 속성을 설정하는 방식이다. 이 패턴은 객체를 여러 단계에 걸쳐 설정할 수 있다.
    * */

    private int par1;
    private String par2;
    private boolean par3;

    public JavaBeans_pattern_3() { }

    public void setPar1(int par1) {
        this.par1 = par1;
    }

    public void setPar2(String par2) {
        this.par2 = par2;
    }

    public void setPar3(boolean par3) {
        this.par3 = par3;

        /* 자바 빈즈 패턴
        *
        * 장점 :
        * - 설정이 쉽고, 필요한 속성만 설정할 수 있으므로 오버로딩된 생성자를 사용하지 않는다.
        * - 객체의 속성을 설정하는 순서나 조합을 제어할 수 있다.
        *
        * 단점 :
        * - 객체의 무결성을 보장하기 어렵다.
        * - 객체가 불변이 아니라면 다른 스레드에서 동시에 수정될 수 있어 스레드 안정성 문제가 발생할 수 있다.
        * */
    }
}
