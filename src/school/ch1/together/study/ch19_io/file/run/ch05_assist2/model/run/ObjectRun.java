package school.ch1.together.study.ch19_io.file.run.ch05_assist2.model.run;

import school.ch1.together.study.ch19_io.file.run.ch05_assist2.model.dao.ObjectDao;

public class ObjectRun {
    public static void main(String[] args) {

        /*
        * 객체단위로 입출력 할수 있는 기능을 제공하는 보조스트림
        * ObjectXXX /
        *
        * */

        ObjectDao od = new ObjectDao();
        od.fileSave("phone.txt");
        od.fileRead();
    }
}
