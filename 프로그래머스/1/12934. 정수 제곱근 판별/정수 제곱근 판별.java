class Solution {
    public long solution(long n) {
        long answer = 0;
        long j = 1;
        for(long i = 1; i <= n; i++)
        {   
            
            
            if((double)n / i == i || n / i == n / (n*i) )
            {
                return (i+1)*(i+1);
            }
            else
            {
                
                continue;    
            }
            
        
        }
        return -1;
    }
}