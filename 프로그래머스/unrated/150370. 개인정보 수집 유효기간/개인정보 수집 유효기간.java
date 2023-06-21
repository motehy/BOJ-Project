import java.util.ArrayList;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<privacies.length; i++){
            String[] str = privacies[i].split(" ");
            String date = str[0];
            String apl = str[1];
            
            String[] dateArr = date.split("\\.");
            String yyyy = dateArr[0];
            String mm = dateArr[1];
            String dd = dateArr[2];
            
            int addmonth = 0;
            for(int j=0; j<terms.length; j++){
                if(terms[j].contains(apl)){
                    String[] monthStr = terms[j].split(" ");
                    addmonth = Integer.parseInt(monthStr[1]);
                    break;
                }
            }
            String[] todayArr = today.split("\\.");
            int todays = 0, pridate = 0;
            todays = convertDate(todayArr[0],Integer.parseInt(todayArr[1]),Integer.parseInt(todayArr[2]), false);
            
            pridate = convertDate(yyyy, Integer.parseInt(mm)+addmonth, Integer.parseInt(dd),true);
            System.out.println(todays);
            if(todays>pridate){
                list.add(i+1);
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    
    public static int convertDate(String yyyys, int mms, int dds, boolean conv){
        int n =0;
        if(conv){
            dds--;
            if(dds-1 < 0){
                dds=28;
                mms--;
            }
        }
        n = (Integer.parseInt(yyyys)*12*28) + mms*28 + dds;
        return n;
    }
}