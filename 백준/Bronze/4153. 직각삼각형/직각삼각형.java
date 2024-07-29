import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            //세개의 숫자가 0이라면 종료
            if (arr[0] == 0 && arr[1] == 0 && arr[2] ==0) break;

            //숫자가 작은 순서대로 정렬
            for (int i = 0; i < arr.length - 1; i++) {
                int tmp;
                if (arr[i] > arr[i+1]) {
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }

            double powNum1 = Math.pow(arr[0], 2);
            double powNum2 = Math.pow(arr[1], 2);
            double powNum3 = Math.pow(arr[2], 2);

            if (powNum3 == powNum1 + powNum2) sb.append("right").append("\n");
            else sb.append("wrong").append("\n");
        }
        System.out.println(sb);
    }
}
