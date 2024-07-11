class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        int cnt = 0;
        char[] cArr = s.toCharArray();
        if(cArr.length != 4 && cArr.length != 6)
        {
            return false;   
        }
        for(int i = 0 ; i < cArr.length; i++)
        {   
            if(48 <= cArr[i] && cArr[i] <= 57)
                count++;
        }
        if(count == cArr.length)
            return true;
        else
            return false;
            
        
        
        
    }
}