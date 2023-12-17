package school.ch1.together.study.ch16_abstractandinterface.model;

public class Football extends Sports{

    public Football() {}

    public Football(int people) {
        super.setPeople(people);
    }

    @Override
    public void rule(){
        System.out.println("발을 사용해 득점을 해야한다.");
    }
}
