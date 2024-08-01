import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> honor = new ArrayList<Integer>();
        for(int i = 0; i < score.length; i++)
        {
            if(honor.size() < k)
            {
                honor.add(score[i]);
            }
            else
            {
               if(score[i] > Collections.min(honor))
               {
                   honor.remove(Collections.min(honor));
                   honor.add(score[i]);
               }
            }
            answer[i] = Collections.min(honor);
        }


        return answer;
    }
}