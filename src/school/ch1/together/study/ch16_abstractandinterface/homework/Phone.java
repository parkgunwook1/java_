package school.ch1.together.study.ch16_abstractandinterface.homework;

public interface Phone {
    public char[] NUMBERPAD = {'1','2','3','4','5','6' ,
            '7', '8', '9', '*', '0', '#'};

    String makeCall() ; // 전화걸기
    String takeCall(); // 전화받기

}
