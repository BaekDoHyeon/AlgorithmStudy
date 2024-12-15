import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        while (!(str = br.readLine()).equals("0")) {
            int lt = 0, rt = str.length() - 1;
            boolean flag = true;

            while(lt < rt) {
                if (str.charAt(lt) != str.charAt(rt)) {
                    sb.append("no").append("\n");
                    flag = false;
                    break;
                }

                lt++;
                rt--;
            }

            if (flag) sb.append("yes").append("\n");
        }

        System.out.println(sb);
    }
}