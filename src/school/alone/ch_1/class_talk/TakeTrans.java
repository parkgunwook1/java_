package school.alone.ch_1.class_talk;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentPark = new Student("Park" , 5000);
        Student studentLee = new Student("Lee",10000);

        Bus bus = new Bus(11);
        studentPark.takeBus(bus);
        studentPark.showInfo();
        bus.showInfo();

        Subway subway = new Subway("2호선");
        studentLee.takeSubway(subway);
        studentLee.showInfo();
        subway.showInfo();
    }
}
