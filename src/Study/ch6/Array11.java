package Study.ch6;

import java.util.Arrays;
import java.util.Comparator;

public class Array11 {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item("java",5000);
        items[1] = new Item("파이썬", 4000);
        items[2] = new Item("c", 4500);
        items[3] = new Item("자바스크립트", 5500);
        items[4] = new Item("dart", 2000);

        // sort(Object[]) - Object 는 모든 객체의 조상이니깐, 어떤 객체의 배열이든 올 수 있다.
        Arrays.sort(items, (item1, item2) -> item1.getName().compareTo(item2.getName()));

        for (Item item : items) {
            System.out.println(item);
        }

    }
}
class ItemSorter implements Comparator {
    // 외부에서 정렬할 수 있다.
    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item)o1;
        Item item2 = (Item)o2;
        return item1.getName().compareTo(item2.getName());
    }
}

// Comparable 는 어떤 Item이 큰지, 작은지 기준을 정하는 인터페이스
class Item implements Comparable{
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
//    // 파라미터로 들어온 object와 내 자신을 비교하는 메소드
//    // compareTo 에는 object 를 받아들이도록 했지만 실제로는 item이 들어온다.
//    // String 이름 : 유니코드 순서로 비교한다.
//    @Override
//    public int compareTo(Object o) {
//        Item d = (Item)o;
//        return this.name.compareTo(d.name); // 양수,0,음수
//    }
    @Override
    public int compareTo(Object o) {
        Item d = (Item)o;
        return this.price - d.price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
