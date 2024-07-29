import java.util.ArrayList;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = i + 1; j < numbers.length; j++)
            {
                if(!arrList.contains(numbers[i] + numbers[j]))
                    arrList.add(numbers[i]+numbers[j]);
            }
        }
        return arrList.stream().sorted().mapToInt(i -> i).toArray(); 
    }
}