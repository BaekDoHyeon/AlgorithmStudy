import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //바구니 개수
        int m = sc.nextInt(); //역순으로 바꿀 횟수

        int[] arr = new int[n];

        for(int i = 1; i <= arr.length; i++)
            arr[i-1] = i;

        for (int cnt = 0; cnt < m; cnt++) {
            //역순으로 만드는 방법 -> i번째 바구니부터 j번째 바구니를 역순으로 만든다.
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            while(i < j) {
                int tmp = 0;
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }

        for (int i : arr) 
            System.out.print(i + " ");
    }
}