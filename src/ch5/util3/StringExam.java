package ch5.util3;

public class StringExam {
    public static void main(String[]args) {
//        String str1 = "hello";
//        String str2 = "hello";
//        String str3 = new String("hello");
//        String str4 = new String("hello");
//
//        if(str1 == str2)
//            System.out.println("true1");
//        if(str2 == str3)
//            System.out.println("true2");
//        if(str3 == str4)
//            System.out.println("true3");
//
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);

        String str1 = "hello";
        String str2 = new String("hello");

        if(str1.equals(str2)) { // 값이 같으냐?
            System.out.println("str1과 str2의 값이 같다.");
        }

    }
}
