package ch6.ch8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetExam02 {
    public static void main(String[] args) {
        Set<MyData> mySet = new HashSet<>();
        mySet.add(new MyData("kim", 500));
        mySet.add(new MyData("lee", 200));
        mySet.add(new MyData("hong", 300));
        mySet.add(new MyData("hong", 300));

        Iterator<MyData> iterator = mySet.iterator();
        while(iterator.hasNext()) {
            MyData myData = iterator.next();
            System.out.println(myData);
        }

    }
}
class MyData {
    private String name;
    private int value;

    public MyData(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    // equals() - 두 객체의 내용이 같은지 확인하는 메소드 이다.
    // hashcode() - 두 객체가 같은 객체인지 확인하는 메소드이다.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return value == myData.value && Objects.equals(name, myData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "MyData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
