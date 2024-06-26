import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalMinute;
        int alarmHour;
        int alarmMinute;
        String alarmSettingTime = in.nextLine(); //첫 줄에 숫자 두개를 받기 위해 nextLine() 사용

        String[] hourMinute = alarmSettingTime.split(" "); //첫 줄에 공백으로 구분한 두 숫자를 공백 기준으로 잘라서 가져옴
        int hour = Integer.parseInt(hourMinute[0]); //첫 줄 첫 번째 입력된 값은 상근이가 현재 설정한 알람 시간(hour)
        int minute = Integer.parseInt(hourMinute[1]); //첫 줄 두 번째 입력된 값은 상근이가 현재 설정한 알람 시간(minute)

        if (hour == 0) hour = 24;

        //설정한 시간에서 45분 전에 알람을 맞춘다.
        totalMinute = ((hour*60) + minute) - 45;
        alarmHour = totalMinute / 60;
        alarmMinute = totalMinute % 60;

        if (alarmHour == 24) alarmHour = 0;

        System.out.println(alarmHour + " " + alarmMinute);

    }
}
