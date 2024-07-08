import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        double[] arr = new double[count];

        double max = 0;
        double total = 0.0;

        //점수 입력
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max)
                max = arr[i];
        }

        //구현 로직(최대값을 사용해서 점수 조작)
        for (int i = 0; i < count; i++)
            total += arr[i]/max *100;
        

        //평균값을 구해서 리턴
        System.out.println(total/arr.length);
    }
}
