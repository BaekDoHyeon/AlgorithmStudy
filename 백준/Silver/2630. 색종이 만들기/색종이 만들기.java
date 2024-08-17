import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int white, blue;
    static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        board = new int[n][n];

        //board 판 입력
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                board[i][j] = num;
            }
        }

        partition(0, 0, n);
        System.out.println(white);
        System.out.println(blue);

    }

    //현재 파티션이 전부 같은 색상인지 확인 후, 그렇지 않다면 파티션을 나누는 기능
    static void partition(int row, int col, int size) {

        // 0이면 흰색, 1이면 파란색
        int color = board[row][col];

        //만약 현재 파티션이 전부 같은 색상이라면...
        if (colorCheck(row, col, size)) {
            if (color == 0)
                white++;
            else blue++;
        } else { //만약 현재 파티션이 전부 같은 색상이 아니라면... 파티션을 나눈다..
            int newSize = size/2;

            partition(row, col + newSize, newSize); //1 사분면
            partition(row, col, newSize); //2 사분면
            partition(row + newSize, col, newSize); //3 사분면
            partition(row + newSize, col + newSize, newSize); //4 사분면
        }
    }


    //현재 파티션의 색상이 전부 같은지 확인하는 기능
    static boolean colorCheck(int row, int col, int size) {
        int color = board[row][col]; //처음 위치의 색상을 기준으로 잡는다.

        // board를 돌면서 색상이 다른게 있는지 확인한다.
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != color)
                    return false;
            }
        }
        return true;
    }
}
