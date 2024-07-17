import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<int[]> stack = new Stack<>();

        //탑의 개수를 입략
        int topCnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= topCnt; i++) {
            int tower = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty()) {
                if (stack.peek()[1] > tower) {
                    sb.append(stack.peek()[0]).append(" ");
                    break;
                }
                stack.pop();
            }

            //top이 맨 처음 들어올 때 한번 실행
            if (stack.isEmpty()) {
                sb.append("0 ");
            }

            // i: 탑의 번호, tower: 탑의 높이
            stack.push(new int[] {i, tower});
        }
        System.out.println(sb);
    }
}