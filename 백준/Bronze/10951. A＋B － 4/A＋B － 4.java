import java.io.*;

//EOF 관련하여 내용 공부가 필요한 문제
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String input = br.readLine();
            if (input == null || input.isEmpty()) break;

            String[] tmp = input.split(" ");
            int num1 = Integer.parseInt(tmp[0]);
            int num2 = Integer.parseInt(tmp[1]);

            bw.write(num1 + num2 + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
