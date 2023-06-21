class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String samp = "";
        for(int i= 0; i<s.length(); i++){
            char ch = s.charAt(i);
            String str = String.valueOf(ch);
            
            if(samp.contains(str)){
                answer[i] = i - samp.lastIndexOf(str);
            }else{
                answer[i] = -1;
            }
            samp += str;
        }
        return answer;
    }
}