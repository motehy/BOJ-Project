import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String[] args) {
	    try {
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		int N = Integer.parseInt(st.nextToken());	// 행렬 세로
    		int M = Integer.parseInt(st.nextToken());	// 행렬 가로
    		
    		int[][] A = new int[N][M];
    		int[][] B = new int[N][M];
    		
    		for(int i=0; i<N; i++){
    		    st = new StringTokenizer(bf.readLine());
    		    String str = st.nextToken();
    		    for (int j = 0; j < M; j++) {
    				A[i][j] = Character.getNumericValue(str.charAt(j));
    			}
    		}
    		
    		for(int i=0; i<N; i++){
    		    st = new StringTokenizer(bf.readLine());
    		    String str = st.nextToken();
    		    for (int j = 0; j < M; j++) {
    				B[i][j] = Character.getNumericValue(str.charAt(j));
    			}
    		}
    		
    		int count = 0;
    		for(int i=0; i<N; i++){
    		    for(int j=0; j<M; j++){
    		        int a = A[i][j];
    		        int b = B[i][j];
    		        
    		        if(a != b){
                        if(j+3 >M || i+3 > N) continue;
    		            A = converArr(A, i, j);
    		            count++;
    		        }
    		    }
    		}
    		
    		for (int i = 0; i < N; i++) {
    			for (int j = 0; j < M; j++) {
    				if (A[i][j] != B[i][j]) {
    					System.out.println(-1);
    					return;
    				}
    			}
    		}
    		System.out.println(count);
    	
    		bf.close();
		
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	public static int[][] converArr(int[][] arr, int x, int y){
	    int X= arr.length;
	    int Y= arr[0].length;
	    for(int i=x; i<x+3; i++){
	        for(int j=y;j<y+3; j++){
	            if(i >= X || j >= Y) continue;
	            if(0 == arr[i][j]){
	                arr[i][j] = 1;
	            }else{
	                arr[i][j] = 0;
	            }
	        }
	    }
	    return arr;
	}
}
