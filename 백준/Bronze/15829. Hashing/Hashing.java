import java.io.IOException;
import java.util.Scanner;

public class Main {
    final static long R = 31;
    final static long M = 1234567891;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int L = sc.nextInt();
        String str = sc.next();
        long result = 0;
        long pow = 1;
        for (int i = 0; i < L; i++) {
            result += ((str.charAt(i) - 96) * pow);
            pow = (pow * 31) % M;
        }

        System.out.println(result % M);
    }
}