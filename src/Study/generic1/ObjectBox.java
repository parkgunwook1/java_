package study.generic1;

public class ObjectBox {
    private Object object;

    public void set(Object obj){
        this.object = obj;
    }

    public Object get() {
        return this.object;
    }
}
