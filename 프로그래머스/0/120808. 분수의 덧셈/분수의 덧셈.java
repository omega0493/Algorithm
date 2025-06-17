import java.util.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int[] answer = new int[2];
        
        int a = 0;
        
        int answer0 = 0;
        
        int answer1 = 1;
        
        if(denom2 % denom1 == 0) {
            a = denom2 / denom1;
            
            answer0 = (a * numer1) + numer2;
                
            answer1 = denom2;
        } else {
            
            answer0 = numer1 * denom2 + numer2 * denom1;
            
            answer1 = denom1 * denom2;
        }
        
        int gcd = gcd(answer0, answer1); 
        answer0 /= gcd;
        answer1 /= gcd; 
        
        answer[0] = answer0;
        
        answer[1] = answer1;
        
        return answer;
    }
    
        public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}