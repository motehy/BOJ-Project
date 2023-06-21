class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        String baseS = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            String str = String.valueOf(ch);
            if("".equals(baseS)){
                baseS = str;
                answer ++;
                count ++;
                continue;
            }
            if(baseS.equals(str)){
                count ++;
            }else{
                count--;
            }
            if(count == 0){
                baseS = "";
            }
        }
        return answer;
    }
}