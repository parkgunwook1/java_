package school.alone.ch_1.collection.arraylist;

import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<String>();

    public void enQueue(String data) { // 큐의 맨 뒤에 추가
        arrayQueue.add(data);
    }
    public String deQueue() {  // 큐의 맨 앞에서 꺼냄
        int len = arrayQueue.size();
        if(len == 0) {
            System.out.println("큐가 비었습니다.");
            return null;
        }
        return(arrayQueue.remove(0)); // 맨 앞의 자료 반환하고 배열에서 제거
    }
}

public class QueueTest {
    // 큐는 선착순이다. 먼저 추가된 데이터부터 꺼내서 사용하는 방식 (First In First Out) 방식이다.
    public static void main(String[] args) {

        MyQueue queue = new MyQueue();
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
