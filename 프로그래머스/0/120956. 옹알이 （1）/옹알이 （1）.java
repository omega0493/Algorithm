class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

                String[] validWords = {"aya", "ye", "woo", "ma"};

                for(String a : babbling) {
                    String b = a;
                    boolean valid = true;
                    for(String word : validWords) {

                        if (a.contains(word + word)) {
                            valid = false;
                            break;
                        }

                        b = b.replace(word, "-");
                    }

                    b = b.replace("-", "");

                    if(b.isEmpty() && valid) {
                        answer ++;
                    }

                }

                return answer;
    }
}