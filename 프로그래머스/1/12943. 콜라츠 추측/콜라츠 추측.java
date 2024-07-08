class Solution {
    public int solution(long n) {
        int answer = 0;
        if(n == 1)
            return answer;
        while(n != 1)
        {
            if(answer >= 500)
            {   answer = -1;
                return answer;
            }
            if(n % 2 == 0)
                n /= 2;
            else 
                n = n * 3 + 1;
            
            
            answer++;
        }
        
        
        
        return answer;
       
    }
}