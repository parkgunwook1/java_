package school.alone.ch_1.stream.inputstream;

public class as {
    public static void main(String[] args) {


    int a = 5;
    int b = 10;

    int c = (++a) + b;
        System.out.println("c = " + c);
    int d = c / a;
        System.out.println("d = " + d);
    int e =  c % a;
        System.out.println("e = " + e);

    int f = e++;
        System.out.println("f = " + f);
    int g = (--b) + (d--);
        System.out.println("g = " + g);

    int h = 2;
        System.out.println("h = " + h);
    int i = (a++) + b / (--c /f) * (g-- -d) % (++e + h);
        System.out.println("i = " + i);
}
}
