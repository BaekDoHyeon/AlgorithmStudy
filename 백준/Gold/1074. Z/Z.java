import java.util.Scanner;

public class Main {

    static int r, c, dis;
    static boolean isFind = false;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();

        int size = (int) Math.pow(2, n);

        partition(0, 0, size, n);

        System.out.println(dis);
    }

    static void partition(int x, int y, int size, int n) {
        //이미 답을 찾았다면 종료
        if (isFind) return;

        if (!(x <= r && (x + size) >= r && y <= c && y + size >= c)) {
            dis += size * size;
            return;
        }

        //N > 1인 경우, 배열을 크기가 2N-1 × 2N-1로 4등분 한 후에 재귀적으로 순서대로 방문한다.
        if (n > 1) {
            int newN = n - 1;
            int newSize = (int) (Math.pow(2, newN));

            partition(x, y, newSize, newN); //2사분면
            partition(x, y + newSize, newSize, newN); //1사분면
            partition(x + newSize, y, newSize, newN); //3사분면
            partition(x + newSize, y + newSize, newSize, newN);//4사분면
        } else moveZ(x, y, size);
    }

    static void moveZ(int x, int y, int size) {
        if (x <= r && x + 1 >= r && y <= c && y + 1 >= c) {
            for (int i = x; i < size + x; i++) {
                for (int j = y; j < size + y; j++) {
                    if (i == r && j == c) {
                        isFind = true;
                        return;
                    }
                    dis++;
                }
            }
        } else dis += 4;
    }
}
