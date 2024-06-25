import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10의 12승)이 공백을 사이에 두고 주어진다.
        //int 타입으로 입력 받을 경우 오버플로우가 발생할 수 있다. -> 10의 12승이므로 long 타입으로 받아야 한다.
        long num1 = in.nextLong();
        long num2 = in.nextLong();
        long num3 = in.nextLong();

        long result = (num1 + num2 + num3);
        System.out.println(result);
    }
}