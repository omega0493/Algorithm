import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int nl = nums.length / 2;
        
        System.out.println(nl);
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
           
        }
        
        for (int i : map.keySet()) {
            answer++;
        }
        
        if(answer > nl) {
            answer = nl;
        }
        
        return answer;
    }
}