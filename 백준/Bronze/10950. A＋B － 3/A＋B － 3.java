import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       int loopCount = in.nextInt();
       int[] array = new int[loopCount];

        for (int i = 0; i < loopCount; i++) {
            int inputNum1 = in.nextInt();
            int inputNum2 = in.nextInt();
            array[i] = (inputNum1 + inputNum2);
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
