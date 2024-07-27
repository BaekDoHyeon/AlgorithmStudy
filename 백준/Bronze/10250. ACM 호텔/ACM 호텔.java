import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        //테스트 데이터 개수
        int cnt = sc.nextInt();

        for (int c = 0; c < cnt; c++) {
            //층 수
            int H = sc.nextInt();

            //호 수
            int W = sc.nextInt();

            //몇번째 손님
            int N = sc.nextInt();

            sb.append(solution(H, W, N)).append("\n");
        }

        System.out.println(sb);
    }

    static int solution(int H, int W, int N) {
        int[][] rooms = new int[H+1][W+1];
        int count = 0;
        int result = 0;

        for (int i = 1; i < rooms[0].length; i++) {
            for (int j = 1; j <= H; j++) {
                count++;
                if (count == N) {
                    result = j * 100 + i;
                    return result;
                }
            }
        }

        return 0;
    }
}
