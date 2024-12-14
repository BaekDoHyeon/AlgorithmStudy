import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] prime = new int[1001];
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        int cnt = 0;
        prime[0] = 1;
        prime[1] = 1;

        for (int i = 2; i < prime.length; i++) {
            for (int j = i; j < prime.length; j += i) {
                if (j != i && j % i == 0) prime[j] = 1;
            }
        }

        for (int i : arr)
            if (prime[i] == 0) cnt++;

        System.out.println(cnt);
    }
}