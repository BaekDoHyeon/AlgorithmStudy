import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] arrA = new int[row][column];
        int[][] arrB = new int[row][column];
        int[][] result = new int[row][column];

        //arrA : 행렬 크기만큼 값 주입
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arrA[i][j] = sc.nextInt();
            }
        }

        //arrB : 행렬 크기만큼 값 주입
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arrB[i][j] = sc.nextInt();
            }
        }

        //행렬들의 합을 저장
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = arrA[i][j] + arrB[i][j];
            }
        }

        //행렬들의 합을 저장
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}