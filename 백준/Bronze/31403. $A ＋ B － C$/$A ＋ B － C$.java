import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int numResult = 0;
        int strResult = 0;

        numResult = a + b - c;
        strResult = Integer.parseInt(String.valueOf(a) + String.valueOf(b)) - c;

        System.out.println(numResult);
        System.out.println(strResult);
    }
}
