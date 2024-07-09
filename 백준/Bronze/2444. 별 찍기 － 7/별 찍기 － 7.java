import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt(); // 5로 가정
        StringBuilder sb = new StringBuilder();
        int startCnt = 1;
        int emptyCnt = cnt;

        if(cnt == 1) {
            System.out.println("*");
        } else {
            for (int i = 0; i < cnt; i++) {
                sb.append(String.format("%" + (emptyCnt++) + "s", startPrint(startCnt))).append("\n");
                if(i == cnt-1) {
                    emptyCnt -= 2;
                    break;
                } else {
                    startCnt += 2;
                }
            }

            for (; cnt >= 1; cnt--) {
                startCnt -= 2;
                sb.append(String.format("%" + (emptyCnt--) + "s", startPrint(startCnt))).append("\n");
            }

            System.out.println(sb);
        }

        sc.close();
    }

    //별 찍기 로직
    static String startPrint(int count) {
        String result = "";
        for (int i = 0; i < count; i++)
            result += "*";
        return result;
    }
}