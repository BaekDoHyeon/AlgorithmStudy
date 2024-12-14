import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.next();

        for (String s : arr) {
            int score = 0;
            int tmp = 0;
            for (char c : s.toCharArray()) {
                if (c == 'O') {
                    tmp += 1;
                    score += tmp;
                }
                else tmp = 0;
            }

            sb.append(score).append("\n");
        }

        System.out.println(sb);
    }
}
