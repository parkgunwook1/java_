package school.alone.ch_1.collection.arraylist;

import java.util.ArrayList;

class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<String>();

    public void push(String data) { // 스택의 맨 뒤에 요소를 추가
        arrayStack.add(data);
    }
    public String pop() {
        int len = arrayStack.size();  // .size -> ArrayList에 저장된 유효한 자료의 개수
        if(len == 0 ) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return (arrayStack.remove(len-1));
    }
}

public class StackTest {
    // 스택은 나중에 추가된 데이터를 먼저 꺼내는 (Last In First Out) 방식이다.
    // 스택은 자료를 추가하는 것을 push 라고 하고, 자료를 꺼내는 것을 pop 이라고 한다. 그리고 스택에 가장 최근에 추가된 자료의 위치를 top 이라고 한다.

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
