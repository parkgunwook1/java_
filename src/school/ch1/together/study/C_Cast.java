package school.ch1.together.study;

public class C_Cast {
    // 형변환 : 값의 자료형을 바꾸는 개념
    // 같은 자료형끼리만 연산 가능, 즉, 다른 자료형이면 형변환 해야한다.

    // 자동형변환 : 작은바이트의 자료형이 큰바이트의 자료형으로 형변환되는 케이스
    public void autoCasting() {

        //1. int(4byte) -> double(8byte)
        int i1 = 10;
        double d1 = i1; // 자동형변환

        System.out.println("i1 :" + i1);
        System.out.println("d1:" +d1);

        int i2 = 12;
        double d2 = 3.3;

        double result = /*(double) */i2+d2;
        System.out.println(result);

        //2. int(4 byte) > long(8 byte)
        int i3 = 1000;
        long l3 = i3;

        long l4 = 2000L; // L을 붙이지 않아도 되는 이유 ? 자동형변환이 가능하기때문..

        //3. 특이케이스 long (8 byte) > float(4byte)
        long l5 = 100000000000L;
        float f5 = l5;

        System.out.println(f5);

        //4. 특이케이스 char 2byte <ㅡ> int 4 byte : 양방향 형변환 가능
        char ch = 65;
        System.out.println(ch);

        int num = '민';
        System.out.println(num);

        // byte + byte
        byte b1 = 1;
        byte b2 = 10;

        // byte로 연산시 연산결과의 정수값은 무조건 int 로 취급해서 강제 형변환을 해줘야 한다.
        byte b3 = (byte)(b1+b2);
        System.out.println("b3 : " + b3);

        // 강제(명시적) 형변환 : 큰 큰기의 자료형을 작은 크기의 자료형으로 형변환 할 경우.

        int iNum = 10;
        double dNum = 5.89;
        // 1. 연산 결과를 int 형으로 맞춰서 강제형변환시키기.
        int iSum = (int)(iNum + dNum); // 10.0 + 5.89 > 15.89 > 15

        int iSum2 = iNum + (int) + dNum; // 10 + 5 = 15

        // 실수값을 정수형으로 강제형변환 할때는 데이터 손실이 무조건 발생한다.

        /* 데이터 손실 테스트 */
        int iNum2 = 290;
        byte bNum2 = (byte) iNum2;
        System.out.println(bNum2);  // 저절로 데이터가 날라간다.

        }
    }

