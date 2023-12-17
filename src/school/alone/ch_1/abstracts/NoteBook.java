package school.alone.ch_1.abstracts;

public abstract class NoteBook extends Computer {
    @Override
    public void display() {  // 추상 메서드를 모두 구현하지 않고 메서드 하나만 구현 했기 때문에 추상 클래스가 된다.
        System.out.println("NoteBook display()");
    }
}
