import java.util.*;

class Solution {
    public int solution(String s) {
        
        int answer = s.length();
        
        for(int i = 1; i <= s.length() / 2; i++) {
            int length = compress(s, i);
            answer = Math.min(answer, length);            
        }
            return answer;
    }
    
    public static int compress(String s, int unitLength) {
        int length = s.length();
        StringBuilder compressed = new StringBuilder();
        String prev = "";  // 이전 단위 문자열
        int count = 1;  // 반복 횟수

        // 문자열을 단위 길이로 자르며 압축
        for (int j = 0; j < length; j += unitLength) {
            // 현재 단위 문자열
            String current = s.substring(j, Math.min(j + unitLength, length));

            if (current.equals(prev)) {
                count++;  // 이전과 같으면 반복 횟수 증가
            } else {
                if (count > 1) {
                    compressed.append(count);  // 반복 횟수가 2 이상이면 숫자 추가
                }
                compressed.append(prev);  // 이전 문자열 추가
                prev = current;  // 현재 문자열을 이전 문자열로 설정
                count = 1;  // 반복 횟수 초기화
            }
        }

        // 마지막에 남은 부분 처리
        if (count > 1) {
            compressed.append(count);
        }
        compressed.append(prev);

        return compressed.length();
    }
}