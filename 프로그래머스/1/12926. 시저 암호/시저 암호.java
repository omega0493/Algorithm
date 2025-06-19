class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            
            if(a == ' ') {
                answer += "" + a;
            } else {
                char next;
                if (Character.isUpperCase(a)) {
                    next = (char) ((a - 'A' + n) % 26 + 'A');
                } else {
                    next = (char) ((a - 'a' + n) % 26 + 'a');
                }
                
                answer += "" + next;
            }
        }
        
        return answer;
    }
}