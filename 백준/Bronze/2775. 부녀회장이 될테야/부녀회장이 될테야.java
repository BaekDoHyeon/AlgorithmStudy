import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = sc.nextInt();

        int[][] arr = new int[15][15];
        for (int i = 0; i < 15; i++) arr[0][i] = i;
        for (int i = 1; i < 15; i++)
            for (int j = 1; j < 15; j++)
                arr[i][j] = arr[i][j-1] + arr[i-1][j];

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sb.append(arr[a][b]).append("\n");
        }

        System.out.println(sb);
    }
}