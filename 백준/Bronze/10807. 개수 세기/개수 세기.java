import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int loopCount = sc.nextInt();
        int[] arr = new int[loopCount];

        for (int i = 0; i < loopCount; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();

        for (int i : arr) {
            if (target == i) count++;
        }

        System.out.println(count);
    }
}