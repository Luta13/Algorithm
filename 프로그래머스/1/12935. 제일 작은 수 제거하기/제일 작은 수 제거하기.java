class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int temp = arr[0];
        if(arr.length == 1)
            return new int[] {-1};
        for(int i : arr)
        {
            if(i < temp)
            {
                temp = i;
            }

        }
        int index = 0;
        for(int j = 0; j < arr.length; j++)
        {

            if(arr[j] != temp)
            {
                answer[index] = arr[j];
                index++;    
            }
            
        }






        return answer;
    }
}