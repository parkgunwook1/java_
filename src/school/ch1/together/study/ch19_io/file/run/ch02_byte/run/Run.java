package school.ch1.together.study.ch19_io.file.run.ch02_byte.run;

import school.ch1.together.study.ch19_io.file.run.ch02_byte.model.dao.FileCharDao;

public class Run {

    public static void main(String[] args) {
        FileCharDao f = new FileCharDao();
        f.fileSave();
        f.fileRead();
    }
}
