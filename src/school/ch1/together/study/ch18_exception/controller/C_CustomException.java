package school.ch1.together.study.ch18_exception.controller;

public class C_CustomException extends RuntimeException{

    /*
    * 특정 상황에서 발생하는 에러를 내가 직접 핸들링하는 방법.
    *
    * 1. 예외처리용 클래스 생성후, Exception 클래스를 상속받음
    *
    * 2. super 키워드를 통해 부모생성자의 매개변수로 메세지값을 전달.
    * */
    public C_CustomException(){

    }
    public C_CustomException(String msg){
        super(msg);
    }
}
