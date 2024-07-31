class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int temp = 0;
        while(n >= a)
        {
         temp = n;
         n = n % a;   
         n += (temp / a) * b;
         answer += (temp / a) * b;
        }
        return answer;
    }
}