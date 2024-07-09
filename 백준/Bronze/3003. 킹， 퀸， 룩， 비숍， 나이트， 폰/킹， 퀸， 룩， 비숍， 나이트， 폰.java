import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //개수를 맞추어야 할 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수를 담을 배열
        int[] sample = {1, 1, 2, 2, 2, 8};

        //킹, 퀸, 룩, 비숍, 나이트, 폰의 개수를 담을 배열
        int[] arr = new int[6];

        //차이 나는 개수를 담을 배열
        int[] result = new int[6];

        //킹, 퀸, 룩, 비숍, 나이트, 폰의 개수를 입력 받고 배열에 저장
        for(int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        //개수가 부족 하면 더하기1, 개수가 많다면 빼기1로 개수를 맞추는 로직
        for(int i = 0; i < arr.length; i++) {
            while(arr[i] != sample[i]) {
                if(arr[i] > sample[i]) {
                    arr[i]--;
                    result[i]--;
                } else if (arr[i] < sample[i]) {
                    arr[i]++;
                    result[i]++;
                }
            }
        }

        //결과 출력
        for (int i : result)
            System.out.print(i + " ");
    }
}