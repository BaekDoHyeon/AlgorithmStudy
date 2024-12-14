import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < arr.length-1; i++) {
            if (Math.abs(arr[i] - arr[i+1]) != 1) {
                System.out.println("mixed");
                flag = false;
                break;
            }
        }

        if (flag) {
            if (arr[0] == 1) System.out.println("ascending");
            else System.out.println("descending");
        }
    }
}
