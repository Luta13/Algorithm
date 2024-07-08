class Solution {
    public String solution(int n) {
        String answer = "";
        char[] cArr = new char[n];
        
        for(int i = 0; i < n; i++)
        {
            if(i % 2 == 0)
            {
                cArr[i] = '수';
            }
            else
            {
                cArr[i] = '박';
            }
        }
        answer = String.valueOf(cArr);
        
        
        return answer;
    }
}