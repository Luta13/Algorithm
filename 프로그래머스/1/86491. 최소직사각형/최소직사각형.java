class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int temp = 0;
        int max = 0;
        int max2 = 0;
       
        for(int i = 0; i < sizes.length; i++)
        {   
            if(sizes[i][0] < sizes[i][1])
            {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            
            
                if(sizes[i][0] > max)
                    max = sizes[i][0];
               
              
                if(sizes[i][1] > max2)
                    max2 = sizes[i][1];
            
            
              
            
        }

        answer = max * max2;
        return answer;
    }
}