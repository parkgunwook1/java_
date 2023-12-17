package school.ch1.together.study.ch20_collection.ch4_propertiers.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun1 {
    public static void main(String[] args) {

        /*
        * Properties : Map 계열 => Key, Value 세트로 저장
        *  단, Properties의 특징은 key, value을 모두 String으로 제한함.
        *  파일 입출력 메소드를 지원함
        *  설정정보를 표현하는데 있어 최적의 형태를 가지고 있음.
        * */
        Properties prop = new Properties();

        /*
        * prop에 String 자료형이 아닌 값을 추가하게 될 경우
        * Map계열 구현클래스이기 때문에 put 메서드를 통해 key + value 추가 가능.
        * */


        /*
        * Properties를 사용하는 경우는 Properties 내부의 key값 value 값들을 묶어서 파일로 기록하거나,
        * 기록된 내용을 읽어들일때만 사용이 된다. 이 때 기록하고자하는 파일에 문자열이 아닌값이 존재하는 경우
        * 기록이 불가능.
        * */

//        try {
//            prop.store(new FileOutputStream("test.properties"), "Properties test");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        // Properties에 값을 추가할때는 put를 잘 사용 안함.
        // 잘못된 자료형의 값을 추가할수 있기 때문.
        // 1. setProperty(String key, Strint value)
        prop.setProperty("List","ArrayList,Vector,LinkedList");
        prop.setProperty("Set","HashSet,TreeSet");
        prop.setProperty("Map", "HashMap,Properties");
        prop.setProperty("Map","TreeMap");
        System.out.println(prop); // 저장순서 유지 x, key값 중복 허용하지 않음

        // 값 가져올때 get 함수 대신 getProperty(String key) 이용
        // 2. getProperty(String key)
        System.out.println(prop.getProperty("Map"));

        // Peoperties 객체 내부의 데이터를 기록하는 방법
        // 3. store( OutputStream os, String comments ) Properteis에 담긴 key - value 값들을 파일로 출력

        try {
            prop.store(new FileOutputStream("test.properties"),"Properties test 1");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. sotreToXMl(OutputStream os, String comments) - xml 문서에 출력

        try {
            prop.storeToXML(new FileOutputStream("test.xml"), "xml test1");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
