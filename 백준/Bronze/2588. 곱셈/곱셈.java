import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int tmp = 0;
        int numCopy = num2;

        for (int i = 0; i < 4; i++) {
            tmp = numCopy % 10;
            numCopy = numCopy / 10;

            if (i == 3) {
                System.out.println(num1 * num2);
            } else {
                System.out.println(num1 * tmp);
            }
        }
    }
}