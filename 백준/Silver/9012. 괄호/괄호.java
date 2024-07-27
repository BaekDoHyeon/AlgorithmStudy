import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean completeFlag = true;

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            Stack<Character> stack = new Stack<>();

            String line = br.readLine();
            for (char c : line.toCharArray()) {
                if (c == '(') stack.push(c);

                if (c == ')') {
                    if (!stack.isEmpty()) stack.pop();
                    else {
                        sb.append("NO\n");
                        completeFlag = false;
                        break;
                    }
                }
            }

            //한 문장이 다 끝났는데, stack 이 비어있지 않다면 -> '(' 가 더 많았다는 뜻 -> 올바른 괄호 문자열(VPS)이 아니다.
            if (completeFlag && !stack.isEmpty()) sb.append("NO\n");
            else if (completeFlag && stack.isEmpty()) sb.append("YES\n");
            completeFlag = true;
        }
        System.out.println(sb);
    }
}
