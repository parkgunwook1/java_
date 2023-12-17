package school.alone.ch_1.abstracts;

public class ComputerTest {
    public static void main(String[] args) {
        /*Computer c1 = new Computer();
        Computer c3 = new NoteBook;*/ //
        // 구현된 코드가 없으므로 수행할 수 있는 내용이 없다. 따라서 추상 클래스는 인스턴스로 구현할 수 없다.

        // 구현된 메서드 : 하위 클래스에서 공통으로 사용할 구현 코드. 하위 클래스에서 재정의할 수도 있음
        // 추상 메서드 : 하위 클래스가 어떤 클래스냐에 따라 구현 코드가 달라짐.

        Computer c2 = new DeskTop();
        Computer c4 = new MyNoteBook();
    }
}
