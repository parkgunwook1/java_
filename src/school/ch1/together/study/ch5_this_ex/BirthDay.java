package school.ch1.together.study.ch5_this_ex;

public class BirthDay { // this는 생성된 인스턴스를 스스로를 가르키는 예약어이다.
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
    }
    public void print() {
        System.out.println(this);
    }
}



