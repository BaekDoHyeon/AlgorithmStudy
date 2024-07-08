import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String num = sc.next();
        int sum = 0;
        char[] charArray = num.toCharArray();

        for(int i = 0; i < count; i++) {
            sum += Integer.parseInt(String.valueOf(charArray[i]));
        }

        System.out.println(sum);
    }
}
