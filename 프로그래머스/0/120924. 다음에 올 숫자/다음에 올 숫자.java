class Solution {
    public int solution(int[] common) {
        int answer = 0;
    
        int num = common.length - 1;
        
        if(common[1] - common[0] == common[2] - common[1]) {
            answer = common[num] + (common[1] - common[0]);
        } else {
            answer = common[num] * (common[1] / common[0]);
        }
        
        return answer;
    }
}