import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //학생 수
        int studentCnt = sc.nextInt();

        //한 방에 들어갈 수 있는 학생 수
        int limitCnt = sc.nextInt();

        //학생 수에 필요한 최소 방의 개수
        int roomCnt = 0;

        //성별, 학년 별로 학생 수를 담아둘 공간
        int[][] students = new int[2][7];

        //학생 수 만큼 입력 -> 첫 번째는 여자면 0, 남자면 1입력 -> 두 번째는 학년 1~6
        for (int i = 0; i < studentCnt; i++) {
            int sex = sc.nextInt(); // 0, 1
            int age = sc.nextInt(); // 1~6

            //해당 성별과 학년에 맞는 인덱스에 1 증가 (학생이 1명 추가되었다는 뜻)
            students[sex][age]++;
        }

        //방 개수를 세는 로직
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 7; j++) {
                if (students[i][j] != 0) {
                    double tmp = Math.ceil((double) students[i][j] / limitCnt);
                    roomCnt += tmp;
                }
            }
        }
        System.out.println(roomCnt);
    }
}