import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            sb.append("Case #"+i+": " + (num1+num2)+"\n");
        }
        System.out.println(sb);
    }
}
