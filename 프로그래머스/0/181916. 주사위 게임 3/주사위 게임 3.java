import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;

        int k = 7;

        int[] ints = new int[4];
        ints[0] = a;
        ints[1] = b;
        ints[2] = c;
        ints[3] = d;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 4; i++) {
            map.put(ints[i], map.getOrDefault(ints[i], 0) + 1);
        }

        if (map.size() == 1) {
            int p = 0;
            
            for (int key : map.keySet()) {
                p = key;
            }
            answer = p * 1111;
        }

        if (map.size() == 2) {
            boolean isSolution = false;

            int p = 0;
            int q = 0;

            for (int i : map.values()) {
                if (i == 3) {
                    isSolution = true;
                }
            }

            if (isSolution) {
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() == 3) {
                        p = entry.getKey();
                    } else {
                        q = entry.getKey();
                    }
                }

                answer = (10 * p + q) * (10 * p + q);
            } else {
                for (int i : map.keySet()) {
                    if (p == 0) {
                        p = i;
                    } else {
                        q = i;
                    }
                }

                answer = (p + q) * Math.abs(p - q);
            }
        }

        if (map.size() == 3) {
            int r = 0;
            int q = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    if (r == 0) {
                        r = entry.getKey();
                    } else {
                        q = entry.getKey();
                    }
                }
            }

            answer = q * r;

        }

        if (map.size() == 4) {
            for (int key : map.keySet()) {
                if (key < k) {
                    k = key;
                }
            }

            answer = k;
        }

        return answer;
    }
}