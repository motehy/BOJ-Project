class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int p_cnt = 0;
        int y_cnt = 0;
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            System.out.println(ch);
            if("p".equals(Character.toString(ch))){
                p_cnt ++;
            }else if("y".equals(Character.toString(ch))){
                y_cnt ++;
            }
        }    
        System.out.println(p_cnt);
        System.out.println(y_cnt);
        if(p_cnt == y_cnt){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}