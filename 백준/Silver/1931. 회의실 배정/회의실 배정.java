import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] times = new int[n][2];
		for(int i=0; i<n; i++){
		    times[i][0] = in.nextInt();
		    times[i][1] = in.nextInt();
		}
		
		Arrays.sort(times, new Comparator<int[]>() {
		    @Override
			public int compare(int[] o1, int[] o2) {
		    	if(o1[1]== o2[1]){
			        return o1[0] - o2[0];
			    }else{
			        return o1[1] - o2[1];   
			    }
	        }
		});
		
        int rn = 0;
        int lastminute = 0;
        for(int i=0; i<times.length; i++){
		    if(times[i][0] >= lastminute){
		        rn ++;
		        lastminute = times[i][1];
		    }
		}
        System.out.println(rn);
	}
}
