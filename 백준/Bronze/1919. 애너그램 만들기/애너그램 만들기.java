import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        int result = 0;
        int[] countArr1 = new int[123]; // a(97) ~ z(122)
        int[] countArr2 = new int[123]; // a(97) ~ z(122)

        char[] arr1 = str1.toCharArray(); //1번 배열과 2번 배열의 크기가 다를 수도 있다..
        char[] arr2 = str2.toCharArray();

        for (char c : arr1)
            countArr1[c]++;

        for (char c : arr2)
            countArr2[c]++;

        // 첫번째 숫자 - 두번째 숫자 = 1이라면 한개를 지워야댐, 만약 2라면 2개를 지워야댐, 0이라면 개수가 같기에 다음으로 넘어간다.
        for (int i = 97; i < countArr1.length; i++) {
            if (Math.abs(countArr1[i] - countArr2[i]) != 0) {
                result += Math.abs(countArr1[i] - countArr2[i]);
            }
        }

        System.out.println(result);
    }
}