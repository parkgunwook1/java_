package study.network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class VerySimpleWebServer {
    public static void main(String[] args) throws Exception{
        // 3030 prot로 대기한다.
        ServerSocket ss = new ServerSocket(9000);

        // 클라이언트를 대기한다.
        // 클라이언트가 접속하는 순간, 클라이언트와 통신할 수 있는 socket을 반환한다.
        System.out.println("클라이언트 접속 기다린다.");
        // Socket은 클라이언트와 통신할 수 있는 객체다.
        Socket socket = ss.accept();

        // 클라이언트와 읽고 쓸수 있는 인풋, 아웃풋 반한된다.
        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();

        // HTTP 프로토콜은 클라이언트가 정보를 서버에게 보내준다. (요청정보)
        byte[] buffer = new byte[512];
        int readCount = 0;

        while((readCount = in.read(buffer)) != -1) {
              System.out.write(buffer,0,readCount);
        }

        System.out.println(socket.toString());

        ss.close();
        System.out.println("서버가 종료된다.");

    }
}
