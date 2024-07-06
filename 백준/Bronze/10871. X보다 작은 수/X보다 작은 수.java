import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[count];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < count; i++)
            arr[i] = sc.nextInt();

        for (int i : arr) {
            if(i < target)
                sb.append(i + " ");
        }

        System.out.println(sb);
    }
}
