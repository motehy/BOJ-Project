import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //선언
		int T = Integer.parseInt(br.readLine());
	    StringTokenizer st;
	    for(int i=0; i<T; i++){
	        st = new StringTokenizer(br.readLine()); //StringTokenizer인자값에 입력 문자열 넣음
            int a = Integer.parseInt(st.nextToken()); //첫번째 호출
            int b = Integer.parseInt(st.nextToken()); //두번째 호출
            
            bw.write(a + b +"\n");
	    }
	    bw.close();
	}
}