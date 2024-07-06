import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //예를 들어 basketCnt=5, intputBallCnt=4 를 입력받았다고 가정
        int basketCnt = sc.nextInt();
        int inputBallCnt = sc.nextInt();

        int[] basket = new int[basketCnt]; //0~4 index

        //공을 넣을 횟수(inputBallCnt) 만큼 반복.
        for (int i = 1; i <= inputBallCnt; i++) {
            int firstBasket = sc.nextInt(); //1~5 입력가능 2
            int LastBasket = sc.nextInt();  //1~5 입력가능 4
            int ballNumber = sc.nextInt();  //1~5 입력가능

            while (firstBasket <= LastBasket) {
                basket[firstBasket-1] = ballNumber;
                firstBasket++;
            }
        }

        for (int i : basket) {
            System.out.print(i + " ");
        }
    }
}
