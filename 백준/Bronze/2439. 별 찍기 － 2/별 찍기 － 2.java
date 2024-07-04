import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        StringBuilder sb = new StringBuilder();
        StringBuilder tmp = new StringBuilder();

        for(int i = 0; i < count; i++) {
            for (int j = 0; j <= i; j++) {
                tmp.append("*");
            }
            sb.append(String.format("%"+count+"s", tmp)).append("\n");
            tmp = new StringBuilder();
        }
        System.out.println(sb);
    }
}
