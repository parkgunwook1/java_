package school.ch1.together.study.ch19_io.file.run.ch07_pratice2.model.dao;

import java.io.*;

public class ScoreDAO {

    public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
        File file = new File("student.txt");

        try(DataOutputStream os = new DataOutputStream(new FileOutputStream(file))) {
            os.writeUTF(name);
            os.writeInt(kor);
            os.writeInt(eng);
            os.writeInt(math);
            os.writeInt(sum);
            os.writeDouble(avg);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public DataInputStream readScore() throws FileNotFoundException {

    }
}
