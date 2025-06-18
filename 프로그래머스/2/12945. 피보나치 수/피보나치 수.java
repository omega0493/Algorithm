class Solution {
    
    static int[] fibo;
    
    public int solution(int n) {
        int answer = 0;
        
        fibo = new int[n + 1];
        
        DFS(n);
        
        answer = fibo[n];
        
        return answer;
    }
    
    public int DFS(int n) {
        if(fibo[n] > 0) {
            return fibo[n];
        } else if(n == 0) {
            return fibo[n] = 0;
        } else if(n == 1) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = (DFS(n - 2) + DFS(n - 1)) % 1234567;
        }
    }
}