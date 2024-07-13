import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int count = sc.nextInt();

        //입력 받은 수를 저장할 컬렉션...
        List<Integer> list = new ArrayList<>();

        //입력 받은 수와 동일 한 순서를 만들기 위한 stack 생성...
        Stack<Integer> stack = new Stack<>();
        int value = 1;

        //값 입력
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        for (int i = 0; i < list.size(); i++) {
            // -1 값이 나온다면 아직 stack 내부에 해당 숫자가 없다는 뜻이므로 다음 숫자 추가를 해준다. (숫자 추가는 1~N 순서대로 추가..)
            if (stack.search(list.get(i)) == -1) {
                sb.append("+\n");
                if (value <= count)
                    stack.push(value++);
            }

            if (stack.lastElement().equals(list.get(i))) {
                stack.pop();
                if (i == list.size()-1) sb.append("-");
                else sb.append("-\n");
                continue;
            } else if (stack.search(list.get(i)) != -1){
                sb.setLength(0);
                sb.append("NO");
                break;
            }

            i--;
        }

        System.out.println(sb);
    }
}