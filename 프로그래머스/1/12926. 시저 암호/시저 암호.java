class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] cArr = s.toCharArray();
        for(int i = 0; i < n; i++)
        {   for(int j = 0; j < cArr.length; j++)
        {       
            if(cArr[j] == ' ')
                continue;
            
            if(cArr[j] != 'z' && cArr[j] != 'Z')
                cArr[j] = (char)(cArr[j] + 1);
            
            else if(cArr[j] == 'z' || cArr[j] == 'Z')
                cArr[j] = (char)(cArr[j] -25);

        }

        }
        answer = String.valueOf(cArr);
        


        return answer;
    }
}