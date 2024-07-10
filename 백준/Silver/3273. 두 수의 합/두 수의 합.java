import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        //수열의 크기
        int size = sc.nextInt(); // 1 ~ 1,000,000

        //수열의 값을 값과 동일한 인덱스 값에 구분할 배열 선언 (size의 크기로..)
        int[] arr = new int[1000001]; // 1 ~ 1,000,000
        //수열의 값을 저장할 배열 선언
        int[] inputArr = new int[size]; // 1 ~ 1,000,000

        //수열의 쌍이 만들어지면 1씩 증가.
        int count = 0;

        //수열 크기만큼 값을 입력하고 해당 값에 해당하는 인덱스에 1을 더해서 구분한다.
        for (int i = 0; i < inputArr.length; i++) {
            int num = sc.nextInt(); //1보다 크거나 같고, 1,000,000보다 작거나 같은 수이다.
            arr[num]++;
            inputArr[i] = num;
        }

        //타겟값 입력
        int target = sc.nextInt(); // 1 ~ 2,000,000

        for (int i = 0; i < inputArr.length; i++) {
            int num = target - inputArr[i]; // num -> 1 ~ 2,000,000 가능...
            
            

            if (num > 1000000 || num < 0 ) continue;

            if (arr[num] != 0)
                count++;
        }

        System.out.println(count/2);
    }
}