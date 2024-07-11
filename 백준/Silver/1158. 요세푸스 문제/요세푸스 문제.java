import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        //사람 수 (입력 7이라고 가정)
        int personCnt = sc.nextInt();

        //몇번째 사람을 제거할 지 (입력 3이라고 가정)
        int removeCnt = sc.nextInt();

        //사람 수를 list에 저장 (1 ~ 7 저장)
        List<Integer> list = new LinkedList<>();
        List<Integer> tmpArr = new ArrayList<>();
        Integer tmp = 0;

        for (int i = 1 ; i <= personCnt; i++)
            list.add(i);

        int count = list.size();

        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {

            // removeCnt(값 3)의 값 번째에 있는 사람을 삭제
            for (int i = 0; i < removeCnt; i++) {
                if (iterator.hasNext())
                    tmp = iterator.next(); //1칸 이동
                else { //다 돌았다면 처음으로 돌아감..
                    iterator = list.listIterator();
                    i--;
                }
            }

            iterator.remove();
            tmpArr.add(tmp);
            count--;

            if (count == 0) break;
            if (!iterator.hasNext()) iterator = list.listIterator();
        }

        //출력
        for (int i = 0; i < tmpArr.size(); i++) {
            if (i == tmpArr.size() - 1)
                sb.append(tmpArr.get(i));
            else sb.append(tmpArr.get(i) + ", ");
        }

        System.out.println("<"+sb+">");
    }
}