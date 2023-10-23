//package school.ch1.together.study.ch19_io.file.run.pratice.controller;
//
//import school.ch1.together.study.ch19_io.file.run.pratice.model.dao.FileDAO;
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class FileController {
//
//    private FileDAO fd = new FileDAO();
//
//    public boolean checkName(String file) {
//        return fd.checkName(file);
//
//
//
//        // FileDAO(fd)의 checkName() 매개변수로 file을 넘겨주고
//        // 그리고 그 반환 값을 그대로 받아 또 반환해줌
//    }
//
//    public void fileSave(String file, StringBuilder sb) {
//
//        String s = sb.toString();
//        fd.fileSave(file, s);
//    }
//    public StringBuilder fileOpen(String file) {
//
//    }
//    public void fileEdit(String file, StringBuilder sb) {
//
//    }
//}
