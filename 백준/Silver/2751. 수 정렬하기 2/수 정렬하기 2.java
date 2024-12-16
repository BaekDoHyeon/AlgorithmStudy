import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = sc.nextInt();
        int[] cnt = new int[2000001];

        for (int i = 0; i < N; i++) {
            cnt[sc.nextInt() + 1000000]++;
        }

        for (int i = 0; i < 2000001; i++) {
            if (cnt[i] != 0) sb.append(i - 1000000).append("\n");
        }

        System.out.println(sb);
    }
}