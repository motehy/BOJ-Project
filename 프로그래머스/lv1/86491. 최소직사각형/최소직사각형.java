import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        ArrayList<Integer> xl = new ArrayList<>();
        ArrayList<Integer> yl = new ArrayList<>();
        ArrayList<Integer> xRslt = new ArrayList<>();
        ArrayList<Integer> yRslt = new ArrayList<>();
        
        for(int x=0; x<sizes.length; x++){
            // xl.add(sizes[x]);
            xl.add(sizes[x][0]);
            yl.add(sizes[x][1]);
        }
        // System.out.println(xl);
        // System.out.println(yl);
        
        for(int x=0; x<xl.size(); x++){
            for(int y=0; y<yl.size(); y++){
                if(x == y){
                    if(xl.get(x) >= yl.get(y)){
                        xRslt.add(xl.get(x));
                        yRslt.add(yl.get(y));
                    }else{
                        xRslt.add(yl.get(y));
                        yRslt.add(xl.get(x));
                    }
                }
            }
        }
        int lastIndex = xRslt.size() - 1;
        Collections.sort(xRslt);
        Collections.sort(yRslt);
        
        System.out.println(xRslt.get(lastIndex));
        System.out.println(yRslt.get(lastIndex));
        answer = xRslt.get(lastIndex) * yRslt.get(lastIndex);
        return answer;
    }
}