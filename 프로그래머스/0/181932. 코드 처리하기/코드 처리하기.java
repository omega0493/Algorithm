class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++) {
            char a = code.charAt(i);
            
            if(mode == 0) {
                if(a != '1') {
                    if(i % 2 == 0) {
                        answer += a;
                    }
                } else {
                    mode = 1;
                }
            } else {
               if(a != '1') {
                   if(i % 2 != 0) {
                        answer += a;
                    }
                } else {
                    mode = 0;
                }
                
            }
            
        }
        
        if(answer.isEmpty()) {
            answer = "EMPTY";
        }
        
        return answer;
    }
}