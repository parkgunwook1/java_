package school.ch1.together.study.ch16_abstractandinterface.model;

public class Basketball extends Sports{

    public Basketball() {}

    public Basketball(int people) {
        super.setPeople(people); // 부모함수의 set 함수 호출
    }

    @Override
    public void rule() { // rule 메서드는 스포츠마다 다르다.
        System.out.println("손으로 공을 던져서 득점해야 한다.");
    }
}
