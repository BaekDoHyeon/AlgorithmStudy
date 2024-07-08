import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < count; i++) {
            int forCnt = sc.nextInt();
            String str = sc.next();
            char[] charArray = str.toCharArray();

            for(int j = 0; j < charArray.length; j++) {
                for(int k = 0; k < forCnt; k++)
                    sb.append(charArray[j]);
            }
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}