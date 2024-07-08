class Solution {
    public String solution(String s) {
        String answer = "";
        char[] cArr = new char[2];
        char c;
        if(s.length() % 2 == 0) {
            cArr[0] = s.charAt(s.length() / 2 - 1);
            cArr[1] = s.charAt(s.length() / 2 );
            answer = String.valueOf(cArr);
            return answer;
        }
        else {
            c = s.charAt(s.length() / 2);
            answer = String.valueOf(c);
        }




        return answer;
    }
}