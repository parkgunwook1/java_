package school.ch1.together.study.ch20_collection.ch4_propertiers.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {
    public static void main(String[] args) {

        Properties prop = new Properties();
        System.out.println("읽기 전 : " + prop);


        try {
            // 5. load(InputStream is)
            prop.load(new FileInputStream("test.properties")); // load 데이터 읽어오기

            // 6. loadFromXml(InputStream is ) : xml 형태의 데이터를 읽어들일때 사용
            prop.loadFromXML(new FileInputStream("test.xml"));
            System.out.println("읽기 후 : " + prop);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("읽은 후 : " + prop);

        // 1. 요소 가져오기
        String map = prop.getProperty("Map");
        String query = prop.getProperty("selectMember"); // db 쿼리문 접근한다.

        System.out.println(map);

        /*
        * .properties 사용하는 경우는
        * 해당 프로그램이 기본적으로 가져야할 설정정보들을 .properties 확장자 문서로 저장해두면
        * key값, value값 모두 문자열로 이루어져있어서 개발자가 아닌 일반관리자가 문서를 다루기에 편하다.
        * 개발자와 일반관리자가 협업을 하기에 좋은 도구다.
        * jdbc시간 이후에 다시한번 활용할 예정.
        *
        * .xml 사용하는 경우는
        * db에서 실행할 쿼리문을 기록할 때 사용할 예정이며, 그 외에도 다른 프로그래밍 언어와
        * 호환성이 좋기때문에 가장 보편적으로 사용되는 파일형태다.
        * */
    }
}
