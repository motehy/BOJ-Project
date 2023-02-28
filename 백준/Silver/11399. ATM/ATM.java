/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Stream;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String person = in.nextLine();
		String times = in.nextLine();
		
		int[] timeArr = Stream.of(times.split(" ")).mapToInt(Integer::parseInt).toArray();
		
		
		List<Integer> timelist = new ArrayList<>();
		for (int i : timeArr) {
            timelist.add(i);
        }
		
		Collections.sort(timelist);
		
		int time = 0;
		int sum = 0;
		for(int i=0; i<timelist.size(); i++){
		    time += timelist.get(i) + sum;
		    sum += timelist.get(i);
		}
		
		System.out.println(time);
	}
}
