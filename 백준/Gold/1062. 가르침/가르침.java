import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main
{
    private static int word_cnt = 0;
    private static int learning = 0;
    private static int maxCnt = 0;
    private static String[] words;
    private static boolean[] alphabet = new boolean[26];
    
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        StringBuilder sb = new StringBuilder();
	        
	        word_cnt = Integer.parseInt(st.nextToken());
	        learning = Integer.parseInt(st.nextToken());
	        
	        words = new String[word_cnt];
	        for(int i=0; i<word_cnt; i++){
	            st = new StringTokenizer(br.readLine());
	            words[i] = st.nextToken();
	            words[i] = words[i].substring(4, words[i].length()-4);
	        }
	        
	        
	        //a, c, i, n, t
	        char[] chs = {'a', 'c', 'i', 'n', 't'};
	        if(learning<5){
	            maxCnt = 0;
	        }else if(learning >= 26){
	            maxCnt = word_cnt;
	        }else{
	            learning -= 5;
	            for(char c :chs){
	                //알파벳 배열에 방문 체크
	                alphabet[c - 97] = true;
	            }
	            
	            checkLogic(0, 0);
	        }
	        sb.append(maxCnt);
	        System.out.println(sb);
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	public static void checkLogic(int start, int count){
	    if(count == learning){
	        int num =0;
	        for(int i=0; i<words.length; i++){
	            String str = words[i];
	            boolean flag = true;
	            for(int j=0; j<str.length(); j++){
	                if(!alphabet[str.charAt(j)-97]){
	                    flag = false;
	                    break;
	                }
	            }
	            if(flag) num++;
	        }
	        maxCnt = Math.max(maxCnt, num);
	        return;
	    }
	    
	    for(int i=start; i<alphabet.length; i++){
	        if(!alphabet[i]){
	            alphabet[i] = true;
	            checkLogic(i, count+1);
	            alphabet[i] = false;
	        }
	    }
	}
}