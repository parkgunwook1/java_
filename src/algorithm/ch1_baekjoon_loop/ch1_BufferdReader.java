package algorithm.ch1_baekjoon_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ch1_BufferdReader {

    public static void main(String[] args) throws IOException {

         /*자바의 I/O 동작은 예외 처리가 필요한 부분이 많기 때문에, 이를 처리하기 위해
         * try-catch 블록을 사용하거나 예외를 던져 호출자에게 처리를 위임한다.
         * IOException 은 여러 I/O 관련 예외의 슈퍼 클래스이기 때문에, 다양한 I/O 예외를 처리하기 위해 사용함/
         *
         * 따라서 BufferedReader 을 사용할 때 throws IOException 을 사용함으로써 예외가 발생하면
         * 이에 대한 적절한 예외 처리를 수행하도록 할 수 있다.
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        // parseInt => 이 메서드는 문자열을 정수로 변환하는 데 사용된다.

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            // StringTokenizer 메서드는 문자열을 특정 구분자 기준으로 나눌 수 있다.
            // readLine() 은 사용자로부터 문자열을 읽어옴.
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
