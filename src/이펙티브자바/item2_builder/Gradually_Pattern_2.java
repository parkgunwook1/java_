package 이펙티브자바.item2_builder;

public class Gradually_Pattern_2 {
    /*
    * 점층적 방식 패턴은 생성자를 다양한 매개변수 조합으로 오버로딩하여 객체를 생성하는 패턴이다.
    * 이 방식은 생성자 호출시 원하는 매개변수만 전달하여 객체를 초기화할 수 있다.
    * */
    private int par1;
    private String par2;
    private boolean par3;

    public Gradually_Pattern_2(int par1){
        this(par1, "default");
    }
    public Gradually_Pattern_2(int par1, String par2){
        this(par1, par2, true);
    }
    public Gradually_Pattern_2(int par1, String par2, boolean par3) {
        this.par1 = par1;
        this.par2 = par2;
        this.par3 = par3;

        /*  점층적 방식 패턴
        *
        * 장점 :
        * - 구현이 간단하며 코드가 직관적이다.
        * - 객체를 생성하는 과정이 단순하고 직접적이므로 초기 학습 곡선이 낮다.
        *
        * 단점 :
        * - 선택적 매개변수가 많아질수록 생성자 오버로딩의 수가 급증하고 유지 관리가 어려워진다.
        * - 가독성이 나빠질 수 있으며, 매개변수의 순서를 혼동할 수 있다.
        * */
    }

}
