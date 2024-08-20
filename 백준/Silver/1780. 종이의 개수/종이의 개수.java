import java.util.Scanner;

/*
[문제]
N×N크기의 행렬로 표현되는 종이가 있다. 종이의 각 칸에는 -1, 0, 1 중 하나가 저장되어 있다. 우리는 이 행렬을 다음과 같은 규칙에 따라 적절한 크기로 자르려고 한다.

만약 종이가 모두 같은 수로 되어 있다면 이 종이를 그대로 사용한다.
(1)이 아닌 경우에는 종이를 같은 크기의 종이 9개로 자르고, 각각의 잘린 종이에 대해서 (1)의 과정을 반복한다.
이와 같이 종이를 잘랐을 때, -1로만 채워진 종이의 개수, 0으로만 채워진 종이의 개수, 1로만 채워진 종이의 개수를 구해내는 프로그램을 작성하시오.

[입력]
첫째 줄에 N(1 ≤ N ≤ 37, N은 3k 꼴)이 주어진다. 다음 N개의 줄에는 N개의 정수로 행렬이 주어진다.

[출력]
첫째 줄에 -1로만 채워진 종이의 개수를, 둘째 줄에 0으로만 채워진 종이의 개수를, 셋째 줄에 1로만 채워진 종이의 개수를 출력한다.

[예제 입력]
9
0 0 0 1 1 1 -1 -1 -1
0 0 0 1 1 1 -1 -1 -1
0 0 0 1 1 1 -1 -1 -1
1 1 1 0 0 0 0 0 0
1 1 1 0 0 0 0 0 0
1 1 1 0 0 0 0 0 0
0 1 -1 0 1 -1 0 1 -1
0 -1 1 0 1 -1 0 1 -1
0 1 -1 1 0 -1 0 1 -1

[예제 출력]
10
12
11
 */
public class Main {

    static int minusOne, zero, one;
    static int[][] board;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        board = new int[n][n];

        //값 입력
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = sc.nextInt();

        partition(0, 0, n);

        System.out.println(minusOne);
        System.out.println(zero);
        System.out.println(one);
    }

    static void partition(int x, int y, int size) {
        int paperNum = board[x][y];

        //만약 현재 종이가 같은 수로 이루어져 있다면...
        if (isSamePaper(x, y, size)) {
            if (paperNum == -1) minusOne++;
            else if (paperNum == 0) zero++;
            else one++;
        } else { //만약 현재 종이가 같은 수로 이루어져 있지 않다면...
            int newSize = size / 3;

            //만약 현재 색종이가 같은 숫자로 이루어져있지 않다면 9등분 해야한다...
            partition(x, y, newSize); // 왼쪽 위
            partition(x, y + newSize, newSize); //위
            partition(x, y + (newSize * 2), newSize);//오른쪽 위
            partition(x + newSize, y, newSize); //왼쪽
            partition(x + newSize, y + newSize, newSize); //가운데
            partition(x + newSize, y + (newSize * 2), newSize); //오른쪽
            partition(x + (newSize * 2), y, newSize); //왼쪽 아래
            partition(x + (newSize * 2), y + newSize, newSize); //아래
            partition(x + (newSize * 2), y + (newSize * 2), newSize); //오른쪽 아래
        }
    }

    //현재 종이가 같은 숫자로 이루 어져 있는지 체크
    static boolean isSamePaper(int x, int y, int size) {
        int curNum = board[x][y];

        for (int i = x; i < size + x; i++)
            for (int j = y; j < size + y; j++)
                if (curNum != board[i][j])
                    return false;

        return true;
    }
}
