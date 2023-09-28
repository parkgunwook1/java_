package study.collectionframwork.Stack;

public class InStack {
    private int[] stk; //스택용 배열
    private int capacity; //스택 용량
    private int ptr; // 스택 포인터

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() { }
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() { }
    }
    public InStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }
    public int push(int x) throws OverflowIntStackException {  //스택에 데이터를 푸시하는 메서드, 스택이 가득 차서 푸시할 수 없는 경우
            if (ptr >= capacity)                                // OverflowIntStackException을 내보낸다.
                throw new OverflowIntStackException();
            return stk[ptr++] = x;
        }
    public int pop() throws EmptyIntStackException {        // 스택의 곡대기에 있는 데이터를 팝하고 그 값을 반환하는 메서드이다.
        if (ptr <= 0)                                       // 스택이 비어 있어 팝을 할 수 없는 경우 EmptyInStackException을 내보낸다.
            throw  new EmptyIntStackException();
        return stk[--ptr];
    }
    public int peek() throws EmptyIntStackException {       // 스택 꼭대기 있는 데이터 들여다보는 메서드이다.
        if (ptr <= 0)                                       // 스택이 비어 있으면 에러 EmptyIntStackException 내보냄.
            throw new EmptyIntStackException();
        return stk[ptr - 1];
    }
    public void clear() {
        ptr = 0;
    }
    public int indexOf(int x) {
        for (int i = ptr -1; i>=0; i--)
            if (stk[i] == x)
                return i;
        return -1;
    }
    public int getCapacity() {
        return capacity;
    }
    public int size() {
        return ptr;
    }
    public boolean isEmpty() {
        return ptr <= 0;
    }
    public boolean isFull() {
        return ptr >= capacity;
    }
    public void dump() {
        if(ptr <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for (int i =0; i < ptr; i++)
                System.out.println(stk[i] + " ");
            System.out.println();
        }

    }
}

