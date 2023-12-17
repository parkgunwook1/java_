package school.alone.ch_1.abstracts;

public class MyNoteBook extends NoteBook{
    @Override
    public void typing() {  // 추상 메서드가 구현된 클래스이므로 abstract 예약어를 사용하지 않는다.
        System.out.println("MyNoteBook typing()");
    }
}
