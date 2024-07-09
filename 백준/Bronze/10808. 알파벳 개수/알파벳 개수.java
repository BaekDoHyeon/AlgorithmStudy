import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] charArray = str.toCharArray();
        int[] arr = new int[123];

        for (int i = 0; i < charArray.length; i++) {
            int num = (int) charArray[i];
            arr[num]++;
        }

        //출력
        for(int i = 97; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}