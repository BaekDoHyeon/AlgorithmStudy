import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int buyCnt = 1; //옆집에서 숫자를 구매한 횟수
        int[] numArr = new int[10]; //기본값은 0

        char[] charArray = String.valueOf(num).toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            int number = Integer.parseInt(String.valueOf(charArray[i]));

            //카드 개수가 부족하지 않다면... 해당 값이 -1라면 카드 부족해서 구매해야하는 상황
            if(numArr[number] != -1) {
                numArr[number]--;
            } else if ((number == 9 || number == 6) && (numArr[9] != -1 || numArr[6] != -1)) {
                //부족하지만 해당 숫자가 9와 6중 하나라면...9와 6은 서로 뒤집어서 사용이 가능하다.
                if (numArr[9] != -1)
                    numArr[9]--;
                else
                    numArr[6]--;
            } else { //-1라면.. -> 카드 개수가 부족하다면
                //구매 횟수를 1개 증가시키고, 0부터 9까지의 카드 개수를 1씩 증가시킨다.
                buyCnt++;
                numArr[number]--;
                for (int j = 0; j < numArr.length; j++)
                    numArr[j]++;
            }
        }
        System.out.println(buyCnt);
    }
}