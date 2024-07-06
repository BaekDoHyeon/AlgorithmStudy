import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] students = new int[30];

        //출석 부른애 번호는 해당 인덱스에 값을 주입 -> 출석을 부르지 않았다면 해당 인덱스 번호(학생 번호)에는 기본값인 0이 주입되어 있을 것이다.
        for(int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            students[num-1] = num;
        }

        //학생 번호에 해당하는 인덱스 값이 0이라면 (출석을 부르지 않았다는 뜻) 해당 학생 번호를 출력 -> 낮은순으로 출력된다.
        for(int i = 0; i < students.length; i++) {
            if (students[i] == 0)
                System.out.println(i+1);
        }
    }
}
