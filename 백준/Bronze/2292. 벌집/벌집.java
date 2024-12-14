import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt(); // 13
        int startNum = 1, result = 0, idx = 0;

        while(true) {
            startNum += 6 * idx++;
            if (n <= startNum) {
                result = idx;
                break;
            }
        }

        System.out.println(result);
    }
}