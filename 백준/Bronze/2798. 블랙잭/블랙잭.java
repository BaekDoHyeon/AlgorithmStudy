import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int N, M, maxValue = 0;
    static int[] cards;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        N = sc.nextInt();
        M = sc.nextInt();
        cards = new int[N];
        for (int i = 0; i < N; i++) cards[i] = sc.nextInt();

        DFS(0, 0, 0);
        System.out.println(maxValue);
    }

    public static void DFS(int L, int n, int sum) {
        if (sum > M) return;
        if (L == 3) {
            maxValue = Math.max(maxValue, sum);
        } else {
            for (int i=n; i<N; i++) {
                sum += cards[i];
                DFS(L+1, i+1, sum);
                sum -= cards[i];
            }
        }
    }
}