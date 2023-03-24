import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
public class Main
{
    
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int N = Integer.parseInt(br.readLine());
	        
	        int[] A = new int[N];
	        int[] B = new int[N];
	        int[] C = new int[N];
	        int[] D = new int[N];
	        
	        int[] AB = new int[N*N];
	        int[] CD = new int[N*N];
	        for(int i=0; i<N; i++){
	            StringTokenizer st = new StringTokenizer(br.readLine());
	            A[i] = Integer.parseInt(st.nextToken());
	            B[i] = Integer.parseInt(st.nextToken());
	            C[i] = Integer.parseInt(st.nextToken());
	            D[i] = Integer.parseInt(st.nextToken());
	        }
	        
	        int idx = 0;
	        for(int i=0; i<N; i++){
	            for(int j=0; j<N; j++){
	                AB[idx] = A[i] + B[j];
	                CD[idx] = C[i] + D[j];
	                idx++;
	            }
	        }
	        
	        Arrays.sort(AB);
	        Arrays.sort(CD);
	        
	        int left = 0, right = N*N-1;
	        long ans = 0;
	        while(left < N*N && right >= 0){
	            if(AB[left] + CD[right] > 0){
	                right--;
	            }else if(AB[left] + CD[right] < 0){
	                left++;
	            }else{
	                long leftCount = 1, rightCount = 1;
        			while (left + 1 < N*N && (AB[left] == AB[left+1])) {
        				leftCount++;
        				left++;
        			}
        			while (right > 0 && (CD[right] == CD[right-1])) {
        				rightCount++;
        				right--;
        			}
        			ans += leftCount * rightCount;
        			left++;
	            }
	        }
	        
            System.out.print(ans);
	        
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}