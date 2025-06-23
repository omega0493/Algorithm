import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int count = 0;
        List<Integer> list = new ArrayList();
        
        for(int i = 0; i < arr.length; i++) {
            if(i == 0) {
                list.add(arr[0]);
                count++;
            } else if(arr[i] != arr[i-1]) {
                list.add(arr[i]);
                count++;
            }
        }
        
        int[] answer = new int[count];
        
        for(int i = 0; i < count; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}