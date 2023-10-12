package school.ch1.together.study.ch12_method.run;

import school.ch1.together.study.ch12_method.controller.MethodTest1;
import school.ch1.together.study.ch12_method.controller.MethodTest2;

public class Run {
    public static void main(String[] args) {
        MethodTest1 mt1 = new MethodTest1();
        mt1.method3(1,2);
        // int result = mt1.method4(2, 12); // 4번

//        int a = mt1.method2(); // 2번
//        System.out.println(a);

        MethodTest2.method();
    }
}
