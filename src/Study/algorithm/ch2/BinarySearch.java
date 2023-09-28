package study.algorithm.ch2;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // 요소를 찾았을 때 인덱스 반환
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // 요소를 찾지 못했을 때 -1 반환
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("요소 " + target + "는 인덱스 " + result + "에 있습니다.");
        } else {
            System.out.println("요소 " + target + "를 찾지 못했습니다.");
        }
    }
}

