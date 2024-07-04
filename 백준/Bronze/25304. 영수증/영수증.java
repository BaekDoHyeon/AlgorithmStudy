import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int totalPrice = in.nextInt();
        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
           int price = in.nextInt();
           int quantity = in.nextInt();
           sum += (price * quantity);
        }

        if (sum == totalPrice)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
