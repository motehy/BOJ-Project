class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int size = phone_number.length() -5;
        System.out.println(size);
        for(int i=0; i<phone_number.length(); i++){
            if(i <= size){
                answer += "*";
            }else{
                answer += Character.toString(phone_number.charAt(i));
            }
        }
        return answer;
    }
}