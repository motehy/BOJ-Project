class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        String[][] jido = new String[n][2];
        for(int i=0; i<arr1.length; i++){
            jido[i][0] = setJido(arr1[i],n);
        }
        for(int i=0; i<arr2.length; i++){
            jido[i][1] = setJido(arr2[i],n);
        }
        
        answer = new String[n];
        for(int x=0; x<jido.length; x++){
            for(int y=0; y<jido.length; y++){
                if(x == y){
                    answer[x] = Long.parseLong(jido[x][0]) + Long.parseLong(jido[x][1]) +"";
                    
                }
            }
            if(answer[x].length() != n){
                int size = n - answer[x].length();
                for(int z = 0; z<size; z++){
                    answer[x] = "0"+answer[x];
                }
            }
        }
        
        for(int i =0; i<answer.length; i++){
            String str = "";
            for(int x =0; x<answer[i].length(); x++){
                if(Character.toString(answer[i].charAt(x)).equals("0") ){
                    str += " ";
                }else{
                    str += "#";
                }
                
            }
            
            answer[i] = str;
            
            
        }
        
        
        return answer;
    }
    
    public String setJido(int num, int size) {
        String str = "";
        int binarysize = 0;
        str = Integer.toBinaryString(num);
        binarysize = str.length();
        if((size - binarysize) > 0){
            for(int i = 0; i<size - binarysize; i++){
                str = "0"+str;
            }
        }
        
        return str;
    }
}