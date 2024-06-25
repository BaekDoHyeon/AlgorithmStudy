import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valueX = in.nextInt();
        int valueY = in.nextInt();

        if (valueX > 0 && valueY > 0) System.out.println("1");
        else if (valueX > 0 && valueY < 0) System.out.println("4");
        else if (valueX < 0 && valueY > 0) System.out.println("2");
        else System.out.println("3");
    }
}