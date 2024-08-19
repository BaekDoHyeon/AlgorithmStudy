import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//쿼드 트리(Quad Tree) 문제
public class Main {

    static int[][] board;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        board = new int[n][n];

        // 값을 입력 받고 난 후 board 배열에 저장...
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            char[] charArray = str.toCharArray();
            for (int j = 0; j < n; j++)
                board[i][j] = Integer.parseInt(String.valueOf(charArray[j]));
        }

        QuadTree(0, 0, n);
        System.out.println(sb);
    }

    /**
     * @param x = 시작 x 좌표 값
     * @param y = 시작 y 좌표 값
     * @param size = 현재 데이터(도형)의 사이즈
     */
    static void QuadTree(int x, int y, int size) {

        // 0은 흰색, 1은 검정색
        int color = board[x][y];

        //만약 압축이 가능하다면...
        if (isCompression(x, y, size)) {
            if (color == 0) sb.append(0);
            else sb.append(1);
        } else { // 2사분면 -> 1사분면 -> 3사분면 -> 4사분면 순서대로...
            int newSize = size / 2;

            sb.append("(");
            QuadTree(x, y, newSize); // 2사분면
            QuadTree(x, y + newSize, newSize); // 1사분면
            QuadTree(x + newSize, y, newSize); // 3사분면
            QuadTree(x + newSize, y + newSize, newSize); // 4사분면
            sb.append(")");
        }
    }

    //하나의 파티션에 동일한 색상들만 존재하는지 검증 로직
    static boolean isCompression(int x, int y, int size) {
        int color = board[x][y];

        for (int i = x; i < size + x; i++)
            for (int j = y; j < size + y; j++)
                if (color != board[i][j]) return false;

        return true;
    }
}
