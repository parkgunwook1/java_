package Study.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressExam {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getLocalHost(); // 내 컴퓨터의 ip 정보를 얻는다.
            System.out.println(ia.getHostAddress());
        } catch (UnknownHostException uhe) {
            uhe.printStackTrace();
        }

        try {
            InetAddress[] iaArray = InetAddress.getAllByName(""); // URL등록
            for (InetAddress ia : iaArray) {
                System.out.println(ia.getHostAddress());

            }
        }catch (UnknownHostException uhe) {
            uhe.printStackTrace();
        }
    }
}
