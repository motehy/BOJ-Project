import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cityStr = in.nextLine();    //도시 개 수
		String roadStr = in.nextLine();    //도로 Km
		String oilStr = in.nextLine();     //기름 리터당 가격
		
		String[] roadArr = roadStr.split(" ");
		String[] oilArr = oilStr.split(" ");
		
		
		int oil = 0;
		int sum = 0;
		for(int i=0; i<roadArr.length; i++){
		    if(i == 0){
		        oil = Integer.parseInt(oilArr[i]);
		        sum = Integer.parseInt(roadArr[i]) * Integer.parseInt(oilArr[i]);
		        continue;
		    }
		    if(oil < Integer.parseInt(oilArr[i])){
		        sum += oil * Integer.parseInt(roadArr[i]);
		    }else{
		        sum += Integer.parseInt(roadArr[i]) * Integer.parseInt(oilArr[i]);
		        oil = Integer.parseInt(oilArr[i]);
		    }
		}
		
		
        System.out.println(sum);
	}
}