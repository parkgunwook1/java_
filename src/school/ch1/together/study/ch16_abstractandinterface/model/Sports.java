package school.ch1.together.study.ch16_abstractandinterface.model;

public abstract class Sports {

    private int people; // 스포츠에 참여하는 선수 명 수

    public Sports() {

    }

    public Sports(int people) {
        this.people = people;
    }

    public int getPeople() { // get > 값을 받아오는 것
        return people;
    }
    public void setPeople(int people) { // 값을 저장하는 set
        this.people = people;
    }
    @Override
    public String toString() {
        return "people :" + people;
    }
    // 추상 메서드
    public abstract void rule();// 스포츠마다 룰은 다르기 때문에 부모클래스에서 정의하면 소용없다.

}
