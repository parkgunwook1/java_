package study.collectionframwork;

public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericBox =  new GenericBox<>();  // 정해지지 않은 타입을 String 으로 사용하겠다.
        genericBox.add("park");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());
    }
}
