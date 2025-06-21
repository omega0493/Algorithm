import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        
        Map<String, Integer> map2 = new HashMap<>();
        
        map.put(s, 0);
        
        System.out.println(map);

        for(int i = 0; i < s.length(); i++){
            for(int j = 1; j < s.length(); j++){
                if(map.getOrDefault(s.substring(0,j), 0)){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}