import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String f = "";
        String[] sArr = String.valueOf(n).split("");
        Arrays.sort(sArr, Collections.reverseOrder());

        for(String s : sArr)
        {
            f += s;
        }

        answer = Long.parseLong(f);

        return answer;
    }
}