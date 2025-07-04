import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        
        for(int x = 1; x <= Math.sqrt(total); x++) {
            if(total % x == 0) {
                int y = total / x;
                if((x - 2) * (y - 2) == yellow) {
                    return new int []{y, x};
                }   
            }
        }
        
        return new int[]{};
    }
}