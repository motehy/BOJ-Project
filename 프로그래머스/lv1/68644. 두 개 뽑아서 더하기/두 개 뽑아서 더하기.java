import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> hashSet = new HashSet<>();
        for(int x = 0; x< numbers.length; x++){
            for(int y=0; y<numbers.length; y++){
                if(x != y){
                    hashSet.add(numbers[x] + numbers[y]);
                }
            }
        }
        answer = new int[hashSet.size()];
        
        ArrayList<Integer> list = new ArrayList<>(hashSet);
        Collections.sort(list);
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}