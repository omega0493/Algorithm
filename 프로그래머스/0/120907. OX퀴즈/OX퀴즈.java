import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i ++) {
            
            String [] b = quiz[i].split(" ");
            
            int x = Integer.parseInt(b[0]);
            int y = Integer.parseInt(b[2]);
            int z = Integer.parseInt(b[4]);
            
            if(b[1].equals("+")) {
                if(x + y == z) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
                
            } else {
                if(x - y == z) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}