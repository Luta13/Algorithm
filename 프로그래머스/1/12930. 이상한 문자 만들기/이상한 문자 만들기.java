class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");
        int count = 0;

        for(String a : sArr)
        {
            if(a.equals(" "))
            {
                count = 0;
            }
            else
                count++;

            if(count % 2 == 0)
            {
                answer += a.toLowerCase();
            }
            else
            {
                answer += a.toUpperCase();
            }
        }

        return answer;
    }
}