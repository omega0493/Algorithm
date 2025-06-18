class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {

            int i = n / a * b;
            
            answer += i;
            n = n % a + i;
        }

        return answer;
    }
}