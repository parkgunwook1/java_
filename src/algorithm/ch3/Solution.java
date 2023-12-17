package algorithm.ch3;

import java.util.Stack;

// 0부터 9까지 이루어진 배열인 숫자에 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거한다.
// 단, 제거된 후 남은 수들을 반환할 때는 배열 원소들의 순서를 유지해야한다.
public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}

