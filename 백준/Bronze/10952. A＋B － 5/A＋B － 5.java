import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        do {
            int a = in.nextInt();
            int b = in.nextInt();

            if(a == 0) {
                break;
            } else {
                sb.append(a + b).append("\n");
            }
        } while(true);

        System.out.println(sb);
    }
}
