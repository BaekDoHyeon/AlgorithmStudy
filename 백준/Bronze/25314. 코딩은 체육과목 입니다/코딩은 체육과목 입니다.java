import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        StringBuilder result = new StringBuilder();

        for( ; count != 0; count -= 4)
            result.append("long ");

        result.append("int");
        System.out.println(result);
    }
}
