class Solution {
    public static Time pos_t = null;
    public static Time ops_t = null;
    public static Time ope_t = null;
    public static Time video_t = null;
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        pos_t = new Time(pos);
        ops_t = new Time(op_start);
        ope_t = new Time(op_end);
        video_t = new Time(video_len);
        addCommends(commands);
        int minute = pos_t.getTime()/60;
        int second = pos_t.getTime()%60;
        
        
        String minuteStr = String.valueOf(minute).length() == 1 ? ("0" + minute) : String.valueOf(minute);
        String secondStr = String.valueOf(second).length() == 1 ? ("0" + second) : String.valueOf(second);
        
        answer = minuteStr + ":" + secondStr;
        return answer;
    }
    
    public static void addCommends(String[] commands){
        for(int i=0; i<commands.length; i++){
            //오프닝 구간에 현재 재생구간이 포함되는지 확인
            if(ops_t.getTime() <= pos_t.getTime() && ope_t.getTime() >= pos_t.getTime()){
                //현재 재생시간 -> 오프닝 종료 시간으로 변경
                pos_t.setTime(ope_t.getTime());
            }
            if("next".equals(commands[i])){
                //현재 재생시간 + 10
                pos_t.setTime(pos_t.getTime() + 10);
                //비디오 종료시간보다 클 경우 비디오 종료시간으로 세팅
                if(pos_t.getTime() >= video_t.getTime()){
                    pos_t.setTime(video_t.getTime());
                    continue;
                }
            }else if("prev".equals(commands[i])){
                //현재 재생시간 - 10
                pos_t.setTime(pos_t.getTime() - 10);
                //비디오 시작시간보다 작을 경우 비디오 시작시간으로 세팅
                if(pos_t.getTime() <= 0){
                    pos_t.setTime(0);
                    continue;
                }
            }
        }
        //오프닝 구간에 현재 재생구간이 포함되는지 확인
        if(ops_t.getTime() <= pos_t.getTime() && ope_t.getTime() >= pos_t.getTime()){
            //현재 재생시간 -> 오프닝 종료 시간으로 변경
            pos_t.setTime(ope_t.getTime());
        }
    }
    
}


class Time {
    private int time;
    public Time (String time){
        String[] timeArrays = time.split(":");
        int minute = Integer.valueOf(timeArrays[0]) * 60;
        int second = Integer.valueOf(timeArrays[1]);
        this.time = minute + second;
    }
    
    public void setTime(int time){
        this.time = time;
    }
    
    public int getTime(){
        return this.time;
    }
}