import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println(solution(num1, num2));
    }

    public static int solution(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
}