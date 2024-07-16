class Solution {
    public int solution(String t, String p) {
        int  answer = 0;
        String v;
        for(int i = 0; i < t.length()-p.length()+1; i++)
        {

            v = t.substring(i,i+p.length());

            if(Long.parseLong(v) <= Long.parseLong(p))
            {
                answer++;
            }


        }




        return answer;
    }
}