import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        int num1 = Integer.parseInt(sb.append(input1).reverse().toString());
        sb.delete(0, sb.length());
        int num2 = Integer.parseInt(sb.append(input2).reverse().toString());

        if (num1 >= num2) System.out.println(num1);
        else System.out.println(num2);
    }
}