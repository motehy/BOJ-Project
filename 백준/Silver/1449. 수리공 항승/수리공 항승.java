import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    try {
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		int N = Integer.parseInt(st.nextToken());	// 물이 새는 곳 수
    		int L = Integer.parseInt(st.nextToken());	// 테이프 길이
    		int min = 0;	// 필요한 테이프의 최소 개수
    		int[] arr = new int[N];
    		st = new StringTokenizer(bf.readLine());
    		for(int i=0; i<arr.length; i++){
    			arr[i] = Integer.parseInt(st.nextToken()); 
    		}
            Arrays.sort(arr);
    		//물이 새는 곳의 범위 ::tapeRange
    		int tapeRange = (int)(arr[0] - 0.5 + L);    //물을 막을 때, 적어도 그 위치의 좌우 0.5만큼 간격을 줘야 물이 다시는 안 샌다고 생각한다.
    		min ++;
    
    		for(int i=1; i<arr.length; i++) {
    			if (tapeRange < (int)(arr[i] + 0.5)){
    				tapeRange = (int)(arr[i] - 0.5 + L);
    				min ++;
    			}
    		}
    
    		System.out.println(min);
    		bf.close();
		
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}