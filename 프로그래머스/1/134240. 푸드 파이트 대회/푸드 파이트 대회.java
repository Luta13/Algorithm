class Solution {
    public String solution(int[] food) {
      
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(i);
            }
        }
        String answer = sb.toString();
        String answer2 = sb.reverse().toString();

        
        return answer + "0" + answer2;
    }
}