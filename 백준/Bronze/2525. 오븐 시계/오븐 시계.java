import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int currentHour = in.nextInt();
        int currentMinute = in.nextInt();
        int necessaryTime = in.nextInt();
        int totalMinute = 0;

        if (currentHour == 0) currentHour = 24;

        totalMinute = (currentHour*60) + currentMinute;
        totalMinute += necessaryTime;

        currentHour = totalMinute / 60;
        currentMinute = totalMinute % 60;

        //두 번째 입력값에 1000 이하의 숫자가 들어올 수 있다.
        //만약 1000 값이 들어오면 -> 약 17시간인데 현재시간이 24시라고 했을 경우 + 17시간하면 41시간이다.
        //고로 currentHour = 0; 이 아닌 24시간을 빼주어 01시 부터 시작하게 만든다.
        if (currentHour >= 24) currentHour -= 24;

        System.out.println(currentHour + " " + currentMinute);
    }
}
