import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int result = num1 * num2 * num3;
        int[] numberArr = new int[10];

        String str = String.valueOf(result);
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            int num = Integer.parseInt(String.valueOf(c));
            numberArr[num]++;
        }

        for (int i : numberArr) {
            System.out.println(i);
        }
    }
}