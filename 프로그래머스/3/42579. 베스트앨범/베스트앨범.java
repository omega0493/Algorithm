import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> map2 = new HashMap<>();

        for(int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
            HashMap<Integer, Integer> hashMap = map2.getOrDefault(genres[i], new HashMap<>());
            hashMap.put(i, plays[i]);
            map2.put(genres[i], hashMap);
        }
        
        List<String> list = new ArrayList(map.keySet());
 
        list.sort(((o1, o2) -> map.get(o2) - map.get(o1)));
        
        for(String p : list) {
            HashMap<Integer, Integer> m = map2.get(p);
            
            int count = 0;
            
            List<Integer> sortedSongs = new ArrayList<>(m.keySet());
            sortedSongs.sort((o1, o2) -> m.get(o2).compareTo(m.get(o1)));
            
            for(Integer s : sortedSongs){
                if(count == 2){
                    break;
                }
                answer.add(s);
                count++;
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}