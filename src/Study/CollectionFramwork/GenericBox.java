package study.CollectionFramwork;

public class GenericBox <T> {
    // 타입을 아직 정해주지않음
    private T t;

    public void add(T obj){
        this.t = obj;
    }
    public T get(){
        return this.t;
    }

}
