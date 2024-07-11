class Solution {
    public int[] solution(int n, int m) {
        
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        int[] answer = new int[2];
        
        for(int i = max; i > 0; i--)
        {
           if(max % i == 0 && min % i == 0)
           {
               answer[0] = i;
               break;
           }
            
        }
        for(int i = 1; i <= max * min; i++)
        {
            if(i % min == 0 && i % max == 0)
            {
                answer[1] = i;
                break;
            }
        }
        
        
        
        
        
        
        
        return answer;
    }
}