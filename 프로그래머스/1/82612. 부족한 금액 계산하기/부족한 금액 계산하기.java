class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sumPrice = 0;
        
        for(int i = 1; i <= count; i++)
        {
           sumPrice += (price * i);       
            
        }
        if(sumPrice > money)
        answer = sumPrice - money;
        else
            return 0;
        
        
        return answer;
    }
}