package school.ch1.com.study.thisex;

public class ThisExample {
    public static void main(String[] args) {
        BirthDay birthDay = new BirthDay();
        birthDay.setYear(2000);
        System.out.println(birthDay);
        birthDay.print();
    }
}
