import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] arr = new int[count];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < count; i++)
            arr[i] = sc.nextInt();

        for (int i : arr) {
            if (max < i )
                max = i;

            if (min > i)
                min = i;
        }

        System.out.println(min + " " + max);
    }
}
