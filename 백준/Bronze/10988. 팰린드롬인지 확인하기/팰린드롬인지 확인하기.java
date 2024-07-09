import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String target = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        String reverse = String.valueOf(sb.append(target).reverse());

        if(target.equals(reverse)) System.out.println(1);
        else System.out.println(0);
    }
}