package school.ch1.together.study.ch17_api.ch3_wrapper;

public class WrapperRun {
    public static void main(String[] args) {
        /*
        * Wrapper 클래스
        * => 기본 자료형을 "객체"로 포장해주는 클래스들을 래퍼런스(Wrapper class)라고 함
        *
        * 기본자료형 < ------ > Wrapper 클래스
        * boolean              Boolean
        * char                 Character
        * byte                 Byte
        * short                Short
        * int                  Integer
        * long                 Long
        * float                Float
        * double               Double
        * */
        int num1 = 10;
        int num2 = 15;

        // 기본자료형 => Wrapper 자료형 변환(자동형변환) / Boxing
        Integer i1 = num1;
        Integer i2 = num2;

        // 기본 자료형에서 객체의 메서드를 활용하고 싶을때 사용.
        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());

        System.out.println(i1.compareTo(i2));
        // a.compareTo(b) : a어ㅣ b를 비교해서 a가 b보다 크면 1 반환, 작으면 -1, 같으면 0을 반환

        // Wrapper 자료형 변수 => 기본자료형 (UnBoxing)
        int num3 = i1;
        int num4 = i2;

        // 기본자료형 < --- > String
        String str1 = "10";
        String str2 = "15.3";

        System.out.println(str1 + str2);

        // 1. String --> 기본자료형 --> 파싱한다.
        //  바꿀자료형의 Wrapper클래스.parseXXX(변환할 문자열)

        int i = Integer.parseInt(str1); // "10" -> 10
        Double d = Double.parseDouble(str2);

        // 2. 기본자료형 ---> String
        //      10    --->   "10"
        String strI = i+"";
        String strI2 = String.valueOf(i);
        String strI3 = Integer.valueOf(i).toString();

        String strDD = String.valueOf(d); // 15.3 ==> "15.3"

    }
}
