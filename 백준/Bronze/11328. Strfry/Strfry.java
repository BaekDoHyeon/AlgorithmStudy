import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder result = new StringBuilder();

        //반복 횟수
        int forCnt = sc.nextInt();

        //입력
        for (int i = 0; i < forCnt; i++) {
            String input1 = sc.next();
            String input2 = sc.next();

            char[] charArray1 = input1.toCharArray();
            char[] charArray2 = input2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            for (char c : charArray1) {
                sb1.append(c);
            }

            for (char c : charArray2) {
                sb2.append(c);
            }

            if (sb1.toString().contentEquals(sb2)) result.append("Possible\n");
            else result.append("Impossible\n");

            sb1.setLength(0);
            sb2.setLength(0);
        }
        System.out.println(result);
    }
}