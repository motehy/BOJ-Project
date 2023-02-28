import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    
	public static void main(String[] args) {
	    try {
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		int T = Integer.parseInt(st.nextToken());
    		
    		int count = 1;
    		int[] rs = new int[T];
    		for(int i=0; i<T; i++){
    		    
    		    st = new StringTokenizer(bf.readLine());
    		    int N = Integer.parseInt(st.nextToken());
    		    
    		    List<Jumsu> list = new ArrayList<>();
    		    count =1;
    		    for(int j=0; j<N; j++){
    		        st = new StringTokenizer(bf.readLine());
    		        int j1 = Integer.parseInt(st.nextToken());
    		        int j2 = Integer.parseInt(st.nextToken());
    		        list.add(new Jumsu(j1, j2));
    		    }
    		    
    		    Collections.sort(list, new Comparator<Jumsu>() {
                	@Override
                	public int compare(Jumsu o1, Jumsu o2) {
                		if(o1.jumsu1== o2.jumsu1){
                			return o1.jumsu2 - o2.jumsu2;
                		}else{
                			return o1.jumsu1 - o2.jumsu1; 
                		}
                	}
                });
                
                int baseX = list.get(0).getJumsu1();
                int baseY = list.get(0).getJumsu2();
                for(int j=1; j<list.size(); j++){
                    int jumsu1 = list.get(j).getJumsu1();
                    int jumsu2 = list.get(j).getJumsu2();
                    
                    if(baseX< jumsu1 && baseY < jumsu2){
                        continue;
                    }else{
                        
                        baseX = list.get(j).getJumsu1();
                        baseY = list.get(j).getJumsu2();
                        count++;
                    }
                }
                rs[i] = count;
    		}
    		
    		for(int num : rs){
    		    System.out.println(num);
    		}
    	    
    		bf.close();
		
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	public static class Jumsu{
        int jumsu1;
        int jumsu2;
        
        public Jumsu(int jumsu1, int jumsu2){
            this.jumsu1 = jumsu1;
            this.jumsu2 = jumsu2;
        }
        
        public int getJumsu1(){
            return jumsu1;
        }
        
        public int getJumsu2(){
            return jumsu2;
        }
        
        public void setJumsu1(int jumsu1){
            this.jumsu1 = jumsu1;
        }
        
        public void setJumsu2(int jumsu2){
            this.jumsu2 = jumsu2;
        }
    }
}
