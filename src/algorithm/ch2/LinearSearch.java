package algorithm.ch2;

public class LinearSearch {
        public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i; // 요소를 찾았을 때 인덱스 반환
        }
    }
    return -1; // 요소를 찾지 못했을 때 -1 반환
}

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int target = 3;
            int result = linearSearch(arr, target);
            if (result != -1) {
                System.out.println("요소 " + target + "는 인덱스 " + result + "에 있습니다.");
            } else {
                System.out.println("요소 " + target + "를 찾지 못했습니다.");
            }
        }
}
