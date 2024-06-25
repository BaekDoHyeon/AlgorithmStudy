import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        //윤년일 때를 구하는 조건
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) System.out.println("1");
        //윤년이 아니면...
        else System.out.println("0");
    }
}