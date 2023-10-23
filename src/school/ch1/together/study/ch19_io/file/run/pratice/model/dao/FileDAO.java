//package school.ch1.together.study.ch19_io.file.run.pratice.model.dao;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class FileDAO {
//
//    public boolean checkName(String file) {
//        File f = new File(file);
//        return f.isFile(); // 실제로 파일을 나타내는지 여부 확인 메서드 true and false
////        f.exists(); // 파일 디렉토리 둘 다 확인
//        // File 객체를 생성하는 매개변수 있는 생성자에 file을 매개변수로 넘겨줌
//        // 해당 파일이 있는지 없는지에 대한 boolean 값을 반환
//    }
//
//    public void fileSave(String file, String s) {
//        FileWriter fw = null;
//
//        try {
//            fw = new FileWriter(file);
//
//            fw.write(s);
//
//            fw.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fw.close();
//            } catch (IOException e){
//                e.printStackTrace();
//            }
//        }
//    }
//    public StringBuilder fileOpen(String file) {
//
//    }
//    public void fileEdit(String file, String s) {
//
//    }
//}
