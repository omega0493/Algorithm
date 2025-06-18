class Solution {
    boolean[] visited;
    
    int answer = 0;
    
    public int solution(int n, int[][] computers) {
        
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                DFS(i, computers, n);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void DFS(int node, int[][] computers, int n) {
        visited[node] = true;
        
        for(int i = 0; i < n; i++) {
            if(computers[node][i] == 1 && !visited[i]) {
                DFS(i, computers, n);
            }
        }
    }
}