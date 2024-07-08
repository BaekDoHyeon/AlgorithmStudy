import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //알파벳 개수는 26개 a~z -> 아스키코드 97~122
        int index = 0;
        int[] alphabetArr = new int[26];
        String str = sc.next();

        for (int i = 97; i <= 122; i++) {
            char acCode = (char) i; //숫자를 아스키코드로 변환(소문자 알파벳으로)
            alphabetArr[index] = str.indexOf(acCode);
            System.out.print(alphabetArr[index++] + " ");
        }
    }
}