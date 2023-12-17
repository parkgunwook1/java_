package school.ch1.together.study.ch16_abstractandinterface.homework2.model;

public abstract class Animal {
    private String name;
    private String kinds;

    protected Animal() {}

    protected Animal(String name, String kinds) {
        this.name = name;
        this.kinds = kinds;
    }
    @Override
    public String toString(){
        return "저의 이름은 " +name +"이고 , 종류는 " +  kinds + "입니다.";
    }
    public abstract void speak();

}
