import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int n, m;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;

    public static void main(String[] args) throws IOException {
        //각각의 수들이 붙어서 입력되는 것을 처리한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer numSt = new StringTokenizer(br.readLine());
        n = Integer.parseInt(numSt.nextToken());
        m = Integer.parseInt(numSt.nextToken());

        board = new int[n+1][m+1];
        dis = new int[n+1][m+1];

        //미로의 숫자를 붙여서 입력받음
        for (int i = 1; i <= n; i++) {
            String line = br.readLine();
            char[] charArray = line.toCharArray();
            for (int j = 1; j <= charArray.length; j++)
                board[i][j] = Integer.parseInt(String.valueOf(charArray[j-1]));
        }

        BFS(new Point(1, 1));

        System.out.println(dis[n][m]);
    }

    static void BFS(Point startPoint) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(startPoint);
        board[startPoint.x][startPoint.y] = 0; // 지나온 길은 0
        dis[startPoint.x][startPoint.y] = 1; // 이동 거리는 현재 1

        while (!queue.isEmpty()) {
            Point cur = queue.poll();

            for (int i = 0; i < dx.length; i++) {
                int afterX = cur.x + dx[i];
                int afterY = cur.y + dy[i];

                if (afterX > 0 && afterY > 0 && afterX <= n && afterY <= m && board[afterX][afterY] == 1) {
                    queue.offer(new Point(afterX, afterY));
                    board[afterX][afterY] = 0;
                    dis[afterX][afterY] = dis[cur.x][cur.y] + 1;
                }
            }
        }
    }
}
