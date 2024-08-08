import java.util.Scanner;

public class Main {

    static int[] arr, ch, result;
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //숫자의 개수 , 1~n
        n = sc.nextInt();

        //수열 내의 숫자 개수
        m = sc.nextInt();

        //1~n 까지의 숫자가 담길 배열
        arr = new int[n];

        //1~n 까지의 숫자중 중복을 피하기 위한 체크 배열
        ch = new int[n];

        //수열을 담을 배열
        result = new int[m];

        for (int i = 0; i < n; i++)
            arr[i] = i + 1;

        DFS(0);
    }

    //수열에 값을 하나 추가하면 cnt 1 증가
    static void DFS(int cnt) {
        if (cnt == m) {
            for (int i : result)
                System.out.print(i + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    result[cnt] = arr[i];
                    ch[i] = 1;
                    DFS(cnt+1);
                    ch[i] = 0;
                    result[cnt] = 0;
                }
            }
        }
    }
}