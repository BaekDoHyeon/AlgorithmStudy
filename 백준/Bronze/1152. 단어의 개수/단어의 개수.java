import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int emptyCnt = 0;

        String[] arr = str.split(" ");
        for (String s : arr)
            if(s.isEmpty()) emptyCnt++;

        System.out.println(arr.length - emptyCnt);
    }
}