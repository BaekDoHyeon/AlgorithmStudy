import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kg5 = 5;
        int kg3 = 3;

        //봉지는 3킬로그램과 5킬로그램 봉지가 있다.
        int input = sc.nextInt(); // [입력1]: 11-3 , [입력2]: 18-4, [입력3]: 9-3
        int result = 0;

        // 입력 값을 5로 나눈 값을 저장 -> 1 이상이면 5보다 큰수 -> tmp는 최대 반복횟수로 사용
        int tmp = input / kg5;

        while (tmp >= 0) {
            if ((input - (kg5 * tmp)) % kg3 == 0) { //5로 나눈 값이 3의 배수 일때...
                input -= (kg5 * tmp); //3의 배수가 남는다.
                result += tmp;

                result += (input / kg3);
                System.out.println(result);
                break;
            }

            tmp--;
        }

        //정확하게 N킬로그램을 만들수 없다면 -1 출력
        if (result == 0)
            System.out.println(-1);
    }
}