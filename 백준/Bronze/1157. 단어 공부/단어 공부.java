import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String upperCase = input.toUpperCase();
        int[] arr = new int[91];
        char[] charArray = upperCase.toCharArray();
        int max = 0;
        boolean multi = false;

        // A(65) ~ Z(90)
        for (char c : charArray) {
            int ascii = (int) c;
            arr[ascii]++;
        }

        for(int i = 65; i <= 90; i++) {
            if (arr[i] > arr[max])
                max = i;
        }

        for(int i = 65; i <= 90; i++) {
            if (i == max) continue;
            else if (arr[i] == arr[max]) multi = true;
        }
        
        if (multi) System.out.println("?");
        else System.out.println((char) max);
    }
}