import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
        // 2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
        // 3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

        // 주사위 3개의 값을 입력
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        //상금을 저장할 변수
        int totalMoney = 0;
        boolean num1Num2 = num1 == num2;
        boolean num1Num3 = num1 == num3;
        boolean num2Num3 = num2 == num3;

        if (num1Num2 && num2Num3) {
            totalMoney = 10000 + num1 * 1000;
            System.out.println(totalMoney);
        } else if (num1Num2 || num1Num3 || num2Num3) {
            if (num1Num2 || num1Num3) {
                totalMoney = 1000 + num1 * 100;
                System.out.println(totalMoney);
            } else if (num2Num3) {
                totalMoney = 1000 + num2 * 100;
                System.out.println(totalMoney);
            }
        } else {
            totalMoney = (num1 >= num2 ? Math.max(num1, num3) : Math.max(num2, num3)) * 100;
            System.out.println(totalMoney);
        }
    }
}
