import java.text.*;
import java.time.*;
import java.util.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        // 1. LocalDate 생성
        LocalDate date = LocalDate.of(2016, a, b);
        System.out.println(date); // // 2021-12-25
        // 2. DayOfWeek 객체 구하기
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        // 3. 숫자 요일 구하기
        int dayOfWeekNumber = dayOfWeek.getValue();
        // 4. 숫자 요일 출력
        System.out.println(dayOfWeekNumber);
        switch (dayOfWeekNumber){
            case 1:
                answer = "MON";
                break;
            case 2:
                answer = "TUE";
                break;
            case 3:
                answer = "WED";
                break;
            case 4:
                answer = "THU";
                break;
            case 5:
                answer = "FRI";
                break;
            case 6:
                answer = "SAT";
                break;
            case 7:
                answer = "SUN";
                break;
        }

        return answer;
    }
}