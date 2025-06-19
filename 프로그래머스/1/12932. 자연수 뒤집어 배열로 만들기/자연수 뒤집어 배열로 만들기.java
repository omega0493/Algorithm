class Solution {
    public int[] solution(long n) {
        String v = String.valueOf(n);
        
        System.out.print(v);
        
        int[] answer = new int[v.length()];
        
        int j = 0;

        for(int i = v.length()-1; i >= 0; i--) {
            answer[j] = Integer.parseInt(String.valueOf(v.charAt(i)));
            j++;
        }
        
        return answer;
    }
}