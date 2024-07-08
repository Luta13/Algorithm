import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[index] = arr[i];
                index++;
            }
        }

        if (index == 0) {
            return new int[] {-1}; // divisor로 나누어 떨어지는 원소가 없을 경우 -1을 포함한 배열 반환
        } else {
            int[] result = Arrays.copyOf(answer, index); // index 길이만큼의 배열로 복사
            Arrays.sort(result); // 정렬
            return result;
        }
    }
}