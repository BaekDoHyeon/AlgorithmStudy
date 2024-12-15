import java.io.IOException;
import java.util.Scanner;

public class Main {
    final static int R = 31;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt();
        String str = sc.next();
        long sum = 0;

        for (int i = 0; i < L; i++) {
            char c = str.charAt(i);
            sum += ((int) c - 96) * Math.pow(R, i);
        }

        System.out.println(sum);
    }
}