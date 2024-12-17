import java.util.Scanner;

//브루트포스 알고리즘..
public class Main {
    static int minValue = Integer.MAX_VALUE;
    static boolean[][] board;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        board = new boolean[N][M];

        // W = true , B = false
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) != 'W') board[i][j] = false;
                else board[i][j] = true;
            }
        }

        int row = N - 7;
        int column = M - 7;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                find(i, j);
            }
        }

        System.out.println(minValue);
    }

    public static void find(int startRow, int startColumn) {
        int endRow = startRow + 8;
        int endColumn = startColumn + 8;
        int count = 0;
        boolean curColor = board[startRow][startColumn];

        for (int i = startRow; i < endRow; i++) {
            for (int j = startColumn; j < endColumn; j++) {
                if (curColor != board[i][j]) count++;
                curColor = !curColor;
            }

            curColor = !curColor;
        }

        /*
         * 첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
         * 첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의 색칠 할 개수(64 - count) 중 최솟값을 count 에 저장
         */
        count = Math.min(count, 64 - count);

        minValue = Math.min(minValue, count);
    }
}
