package Study.algorithm.ch1;

public class Max3Method {

    static int max3(int a, int b, int c) {
        int max = a;
        if(b > max)
            max = b;
        if (c > max)
            max = c;

        return max;
        }
}
