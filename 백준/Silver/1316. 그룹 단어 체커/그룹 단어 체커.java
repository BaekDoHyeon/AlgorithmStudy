import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt(); //반복 횟수
        int[] asciiArr = new int[123]; // a(97) ~ z(122) -> 해당 인덱스의 값이 1이라면 연속된 혹은 하나의 문자가 이미 나왔다는 뜻!
        int groupWordCnt = 0;

        for (int i = 0; i < count; i++) {
            String str = sc.next();

            char[] charArray = str.toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                int num = charArray[j];
                
                if(asciiArr[num] == 1) break; //연속된 혹은 하나의 문자가 이미 나왔는데, 또 나왔다는 것이기 때문에 그룹 단어가 아니다!
                else if (asciiArr[num] == 0) {
                    if (j == charArray.length-1) {
                        groupWordCnt++;
                        break;
                    }

                    for (int k = j+1; k < charArray.length; k++) {
                        if (num != charArray[k]) {
                            asciiArr[num]++;
                            j = k-1;
                            break;
                        }
                    }
                }
            }
            asciiArr = new int[123];
        } //최종 for문 끝
        
        //출력
        System.out.println(groupWordCnt);
    }
}
