import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++) {
            String category = clothes[i][1];
            map.put(category, map.getOrDefault(category, 0) + 1);
            
        }
        
     for(int c : map.values()) {
            answer *= (c + 1);
        }
        
        
        
        
        return answer - 1;
    }
}