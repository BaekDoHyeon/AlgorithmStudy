import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while(true) {
            String input = br.readLine();
            if (input == null || input.isEmpty()) break;

//            String[] arr = input.split("\n");
//            for (String s : arr)
//                bw.write(s + "\n");
            bw.write(input + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}