import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        StringBuilder sb = new StringBuilder();
        
        String[] s = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .toArray(String[]::new);
        
        Arrays.sort(s, (a,b) -> (b + a).compareTo(a + b));
        
        if(s[0].equals("0")) {
            return "0";
        }
        
        for(String v : s) {
            sb.append(v);
        }
        
        return sb.toString();
    }
}