import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
// 		Integer.parseInt(st.nextToken());
		String str = st.nextToken();
		if(Integer.parseInt(str) < 10){
		    str = "0"+str;
		}
		String pareNum = "0";
		String nwnum = str;
		int cnt = 0;
		while (!str.equals(pareNum)){
		    int hap = (Integer.parseInt(nwnum.substring(0,1)) + Integer.parseInt(nwnum.substring(1)));
		    String lastStr = String.valueOf(hap).length() == 1 ? String.valueOf(hap) : String.valueOf(hap).substring(1);
		  
		    nwnum = nwnum.substring(1) + lastStr;
		    pareNum = nwnum;
		    cnt++;
		}
		System.out.println(cnt);
        
	}
}