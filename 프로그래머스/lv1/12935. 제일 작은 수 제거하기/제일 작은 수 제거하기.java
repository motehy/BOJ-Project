import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        if(arr.length == 0 || arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            for(int i=0; i<arr.length; i++){
                list.add(arr[i]);
            }
            Collections.sort(list);
            answer = new int[list.size()-1];
            list.remove(0);
            
            for(int i=0; i<list.size(); i++){
                answer[i] = (int)list.get(i);
            }
            
            list = new ArrayList<>();
            for(int x =0; x<arr.length; x++){
                for(int y=0; y<answer.length; y++){
                    if(arr[x] == answer[y]){
                        list.add(answer[y]);
                    }
                }
            }
            
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
           
        }
        
        return answer;
    }
}