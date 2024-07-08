class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = x;
        int i = 0;
        while(i < n)
        {
            
            answer[i] = sum;
            
            
            sum += x;
            i++;
        }
        
        
        return answer;
    }
}