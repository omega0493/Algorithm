import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[y + 1];
        
        queue.offer(new int[]{x, 0});
        visited[x] = true;
        
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentValue = current[0];
            int currentSteps = current[1];

            if (currentValue == y) {
                return currentSteps;
            }

            if (currentValue + n <= y && !visited[currentValue + n]) {
                visited[currentValue + n] = true;
                queue.offer(new int[]{currentValue + n, currentSteps + 1});
            }

            if (currentValue * 2 <= y && !visited[currentValue * 2]) {
                visited[currentValue * 2] = true;
                queue.offer(new int[]{currentValue * 2, currentSteps + 1});
            }

            if (currentValue * 3 <= y && !visited[currentValue * 3]) {
                visited[currentValue * 3] = true;
                queue.offer(new int[]{currentValue * 3, currentSteps + 1});
            }
        }

        return -1;
    }
}