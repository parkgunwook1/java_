package school.ch1.together.study.ch16_abstractandinterface.homework;

public class GalaxyNote9 extends SmartPhone implements NotePen{

    public GalaxyNote9() {
        super.setMaker("삼성");
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름";
    }
    @Override
    public String takeCall() {
        return  "전화받기 번호 누름";
    }
    @Override
    public String picture() {
        return "1300만 카메라";
    }
    @Override
    public String change() {
        return "고속충전";
    }

    @Override
    public String touch() {
        return "터치 가능";
    }
    @Override
    public boolean bluetoothPen() {

        return true;
    }
    @Override
    public String printInformation() {

        String result = "갤럭시 노트 9은" + super.getMaker()+ "에서 만들어졌고 제원은 다음과 같다.\n";
               result += makeCall()+"\n";
               result += takeCall()+"\n";
               result += picture() + "\n";
               result += change() + "\n";
               result += touch() + " \n";
               result += "블루투스 펜 탑재 여부 : " + bluetoothPen();

       return result;
    }
}
