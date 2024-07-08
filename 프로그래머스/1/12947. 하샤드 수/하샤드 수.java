class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;

        String[] num = String.valueOf(x).split("");

        for(int i=0; i<num.length; i++) {
            sum += Integer.parseInt(num[i]);
        }

        if(x % sum != 0)
            answer = false;

        return answer;
    }
}