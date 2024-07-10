import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        String[] arr = { "c=" , "c-" , "dz=" , "d-" , "lj" , "nj" , "s=" , "z=" };

        // 입력 문자열에서 크로아티아 알파벳을 하나의 문자로 변환
        for (String s : arr)
            input = input.replace(s, "*");

        System.out.println(input.length());
    }
}