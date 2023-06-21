import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        Map<String, Integer> carmap = new HashMap<String, Integer>();
        for (String n : records){
            String carnumber = n.substring(6,10);
            int time = (Integer.parseInt(n.substring(0,2)) * 60 +  Integer.parseInt(n.substring(3,5)));
            if("IN".equals(n.substring(11))){
                if(carmap.containsKey(carnumber)){
                    System.out.println(time);
                    carmap.put(carnumber, carmap.get(carnumber)-time);    
                }else{
                    carmap.put(carnumber, -time);    
                }
            }else{
                if(carmap.containsKey(carnumber)){
                    carmap.put(carnumber, carmap.get(carnumber)+time);    
                }else{
                    carmap.put(carnumber, time);    
                }
            }
            
        }
        carmap.forEach((key, value)
    -> {
        if(value <= 0){
            carmap.put(key, value+1439);
        }
    });
        answer = new int[carmap.size()];
        int answercnt = 0;
        carmap.forEach((key, value) 
        -> {
            Integer t = value - fees[0];
            if(t <= 0){
                carmap.put(key, fees[1]);
            }else{
                int fee = (t%fees[2] != 0) ? (t/fees[2]+1) : t/fees[2];
                carmap.put(key, fees[1] + fee * fees[3]);
            }
        });
        List<String> keySet = new ArrayList<>(carmap.keySet());

        // 키 값으로 오름차순 정렬
        Collections.sort(keySet);

        // for (String key : keySet) {
        //     System.out.print("Key : " + key);
        //     System.out.println(", Val : " + map.get(key));
        // }
        for ( String key : keySet ) {
            answer[answercnt] = carmap.get(key);
            answercnt++;
        }
        
        return answer;
    }
}