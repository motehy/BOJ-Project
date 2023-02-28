import java.util.Scanner;
import java.util.PriorityQueue;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       String s = scan.nextLine();
       
       String[] arr = s.split(" ");
       int lope = Integer.parseInt(arr[0]);
       int make = Integer.parseInt(arr[1]);
       
       PriorityQueue<Integer> num6 = new PriorityQueue<Integer>();
       PriorityQueue<Integer> num1 = new PriorityQueue<Integer>();
       for(int i=0; i<make; i++){
           String store = scan.nextLine();
           String[] storeArr = store.split(" ");
           num6.offer(Integer.parseInt(storeArr[0]));
           num1.offer(Integer.parseInt(storeArr[1]));
       }
       
       int su = lope % 6;
       int rn = 0;
       if(lope <= 6){
           rn = (num6.peek() > num1.peek() * lope) ? num1.peek() * lope : num6.peek();
       }else{
           if(((lope / 6)+1) * num6.peek() > num1.peek() * lope && num1.peek() * lope < (lope / 6) * num6.peek() + su * num1.peek()){
               rn = num1.peek() * lope;
           }else{
               if(su*num1.peek() > num6.peek()){
                   rn = (lope / 6) * num6.peek() + num6.peek();
               }else{
                   rn = (lope / 6) * num6.peek() + su * num1.peek();
               }
           }
       }
       System.out.println(rn);
    }
 
}