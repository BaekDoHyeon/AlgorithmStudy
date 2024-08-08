import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static int[] arr, ch, result;
    static int n, m;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //숫자의 개수 , 1~n
        n = Integer.parseInt(st.nextToken());

        //수열 내의 숫자 개수
        m = Integer.parseInt(st.nextToken());

        //1~n 까지의 숫자가 담길 배열
        arr = new int[n];

        //1~n 까지의 숫자중 중복을 피하기 위한 체크 배열
        //ch = new int[n];

        //수열을 담을 배열
        result = new int[m];

        for (int i = 0; i < n; i++)
            arr[i] = i + 1;

        DFS(0);
        System.out.println(sb);
        long endTime = System.currentTimeMillis();
        //System.out.println("걸린 시간: " + (endTime-startTime));
    }

    //수열에 값을 하나 추가하면 cnt 1 증가
    static void DFS(int cnt) {
        if (cnt == m) {
            for (int i = 0; i < m; i++)
                sb.append(result[i]).append(" ");
            sb.append("\n");
        } else {
            for (int i = 0; i < n; i++) {
                result[cnt] = arr[i];
                DFS(cnt+1);
                result[cnt] = 0;
            }
        }
    }
}
