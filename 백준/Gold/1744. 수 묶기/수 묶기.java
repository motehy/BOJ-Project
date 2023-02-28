import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       ArrayList<Integer> list = new ArrayList<>();
       ArrayList<Integer> list2 = new ArrayList<>();
       int size = scan.nextInt();
       
       for(int i= 0; i<size; i++){
           int num = scan.nextInt();
           
           list.add(num);
       }
       
       int rn = 0;
       int listsize = list.size();
       Collections.sort(list);
       for(int i= 0; i<list.size(); i++){
           if(i == list.size() -1) {
               list2.add(list.get(i));
               break;
           }
           if(i % 2 == 0){
               if(list.get(i)<1 && list.get(i+1) <1){
                   int sum = list.get(i) * list.get(i+1) > list.get(i) + list.get(i+1) 
                            ? list.get(i) * list.get(i+1) 
                            : list.get(i) + list.get(i+1);
                   rn += sum;
                   continue;
               }
               list2.add(list.get(i));
               list2.add(list.get(i+1));
               if(i+1 == list.size()-1){
                   break;
               }
           }
       }
       
       Collections.sort(list2, Collections.reverseOrder());
       
       
       
      for(int i= 0; i<list2.size(); i++){
          if(i % 2 == 0){
              if(i == list2.size()-1){
                  rn += list2.get(i);
                  break;
              }
              if(list2.get(i) * list2.get(i+1) < list2.get(i) + list2.get(i+1)){
                  rn += list2.get(i) + list2.get(i+1);
              }else{
                  rn += list2.get(i) * list2.get(i+1);
              }
          }
      }
       
       
      System.out.println(rn);
    }
 
}