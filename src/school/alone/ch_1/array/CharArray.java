package school.alone.ch_1.array;

public class CharArray {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

        for (int i = 0; i < alphabets.length; i++, ch++) {
            alphabets[i] = ch;
        }
        for(int i = 0; i < alphabets.length; i++) {
            System.out.println(alphabets[i] + "," + (int) alphabets[i]);

        }
        System.out.println("-----------------");

        String[] strArray = {"java","android","c","javascript","python"};

        for(String lang : strArray) {           // 자바5부터 향상된 for 문 || for(변수 : 배열)
            System.out.println(lang);
        }
        System.out.println("------------------");  //이차원 for문

        int[][] arr = new int[2][3];

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
