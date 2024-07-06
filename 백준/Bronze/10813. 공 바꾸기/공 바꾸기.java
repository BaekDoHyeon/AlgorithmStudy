import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //예를 들어 basketCnt=5, intputBallCnt=4 를 입력받았다고 가정
        int basketCnt = sc.nextInt();
        int changeBallCnt = sc.nextInt();

        //0~4 index
        int[] basket = new int[basketCnt]; //기본 값이 들어가 있다?

        //basket 초기화 -> 각자의 바구니는 자신의 번호의 해당하는 공을 하나씩 가지고 시작한다.
        for (int i = 0; i < basket.length; i++)
            basket[i] = i+1;

        //공을 바꿀 횟수(changeBallCnt) 만큼 반복.
        for (int i = 1; i <= changeBallCnt; i++) {
            int tmp = 0;
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            tmp = basket[num1-1];
            basket[num1-1] = basket[num2-1];
            basket[num2-1] = tmp;
        }

        for (int i : basket) {
            System.out.print(i + " ");
        }
    }
}