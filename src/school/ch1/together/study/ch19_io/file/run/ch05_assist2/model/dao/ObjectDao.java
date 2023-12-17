package school.ch1.together.study.ch19_io.file.run.ch05_assist2.model.dao;

import school.ch1.together.study.ch19_io.file.run.ch05_assist2.model.vo.Phone;

import java.io.*;

public class ObjectDao {

    public void fileSave(String fileName) {

        Phone ph = new Phone("010-8917-4343" , "아이폰 pro max 14" , 1000000);

        // 객체를 파일에 출력하고자할때 필요한 스트림
        // ObjectOutputStream : 객체단위로 출력할수 있는 "보조" 스트림.
        // FileOutputStream   : 파일에 데이터를 출력하는 기반스트림

        try(ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(fileName))){

            oos.writeObject(ph);

        } catch ( FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void fileRead() {

        // FileInputStream : 파일로부터 데이터를 1Byte로 읽어들이는 기반 스트림
        // ObjectInputStream : 스트림으로부터 객체단위로 입력 받기 위해 사용되는 보조스트림

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt"))) {

            Phone pn = (Phone)ois.readObject(); // 객체를 읽어들일 때 readObject 사용
            System.out.println(pn);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
