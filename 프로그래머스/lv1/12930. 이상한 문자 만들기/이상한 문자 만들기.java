class Solution {
    public String solution(String s) {
        String answer = "";
        int newIdx = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            //짝수
            if(newIdx % 2 == 0){
                if(" ".equals(Character.toString(ch))){
                    answer += " ";
                    newIdx = 0;
                    continue;
                }else{
                    answer += Character.toString(ch).toUpperCase();
                }
            }else{
                if(" ".equals(Character.toString(ch))){
                    answer += " ";
                    newIdx = 0;
                    continue;
                }else{
                    answer += Character.toString(ch).toLowerCase();
                }
                
            }
            newIdx ++;
        }
        return answer;
    }
}