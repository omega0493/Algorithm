import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            int a = commands[i][0] - 1;
            int j = commands[i][1] - 1;
            int k = commands[i][2] - 1;
            
            List<Integer> list = new ArrayList<>();
            
            for(int t = a; t <= j; t++) {
                list.add(array[t]);
            }
            
            Collections.sort(list);
            answer[i] = list.get(k);
        }
        return answer;
    }
}