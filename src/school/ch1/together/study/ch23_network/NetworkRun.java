package school.ch1.together.study.ch23_network;

import java.io.*;
import java.net.*;

public class NetworkRun {

    public static void main(String[] args) {

        NetworkRun nr = new NetworkRun();
        nr.test3();

    }

    /*
    * InetAddress
    * Ip 주소에 대한 정보를 가진 클래스
    *
    * - ip : 192.168.30.2 4바이트로 이루어진 실제 주소
    * - hostname : naver.com / google.com / iei.or.kr == 도메인 주소
    * */

    public void test1() {
        try {
            InetAddress naver = InetAddress.getByName("naver.com");
            System.out.println(naver.getHostAddress());

            InetAddress[] arr = InetAddress.getAllByName("naver.com");
            System.out.println(arr.length);
            for (InetAddress ip  :  arr) {
                System.out.println(ip.getHostAddress());
            }

            // 내 컴퓨터의 IP 주소
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println(localhost.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    /*
    * URL : 인터넷에 존재하는 서버들의 자원에 접근할 수 있는 "주소"를 다룰수 있는 클래스
    *       실제 url 자원에 대한 객체 생성. 생성된 URL 자원과 입력스트림을 연동시켜서 내부의 데이터를 읽어올수가 있다.
    *
    * protocol + hostname + port + 자원path
    * https:// + docs.oracle.com : 433(기본포트이기때문에 생략가능) + /en/
    *
    * */

    public void test2() {

        try {
            URL url = new URL("https://bozeury.tistory.com/entry/%ED%9E%99Heap%EA%B3%BC-%EC%8A%A4%ED%83%9DStack%EC%9D%98-%EC%B5%9C%EB%8C%80-%ED%81%AC%EA%B8%B0");
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPort() != -1 ? url.getPort() : url.getDefaultPort());
            System.out.println(url.getPath());
            System.out.println(url.getQuery());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    /*
    * URL 연결요청
    * */

    public void test3() {

        String address = "https://bozeury.tistory.com/entry/%ED%9E%99Heap%EA%B3%BC-%EC%8A%A4%ED%83%9DStack%EC%9D%98-%EC%B5%9C%EB%8C%80-%ED%81%AC%EA%B8%B0";
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            URL url = new URL(address);

            // 연결된 url 자원과 http 통신이 가능한 클래스
            URLConnection connection = url.openConnection();

            br = new BufferedReader( new InputStreamReader(connection.getInputStream()));
            bw = new BufferedWriter( new FileWriter("search_result.html"));

            String data = "";
            while ((data = br.readLine()) != null) {

                bw.write(data);
                bw.write("\n");
            }
                System.out.println(data);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
