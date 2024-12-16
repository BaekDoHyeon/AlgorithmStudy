import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[3];
        int digitIdx = -1;
        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            if (!(str.equals("Fizz") || str.equals("Buzz") || str.equals("FizzBuzz"))) {
                arr[i] = Integer.parseInt(str);
                digitIdx = i;
            }
        }

        for (int i = digitIdx; i < 3; i++) arr[digitIdx]++;

        int target = arr[digitIdx];
        if (target % 3 == 0 && target % 5 == 0) System.out.println("FizzBuzz");
        else if (target % 3 == 0) System.out.println("Fizz");
        else if (target % 5 == 0) System.out.println("Buzz");
        else System.out.println(arr[digitIdx]);
    }
}