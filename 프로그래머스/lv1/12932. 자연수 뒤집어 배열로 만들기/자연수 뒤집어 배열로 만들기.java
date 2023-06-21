import java.util.*;
class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        String str = String.valueOf(n);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<str.length(); i++){
            list.add(Integer.parseInt(Character.toString(str.charAt(i))));
        }
        // Collections.sort(list);
        Collections.reverse(list);
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}