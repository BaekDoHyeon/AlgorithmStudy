import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        List<String> list = new LinkedList<>();

        String str = sc.next();
        char[] charArray = str.toCharArray();
        for (char c : charArray)
            list.add(String.valueOf(c));

        //반복 횟수
        int count = sc.nextInt();
        boolean flag = false;

        // ListIterator 사용
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            iterator.next();

            //현재 커서는 마지막에 존재..
            if (!iterator.hasNext()) {
                for (int i = 0; i < count; i++) {
                    String command = sc.next();

                    switch (command) {
                        case "L":
                            if (iterator.hasPrevious()) iterator.previous();
                            break;

                        case "D":
                            if (iterator.hasNext()) iterator.next();
                            break;

                        case "B":
                            if (iterator.hasPrevious()) {
                                iterator.previous();
                                iterator.remove();
                            }
                            break;

                        default:
                            String plusStr = sc.next();
                            iterator.add(plusStr);
                            break;
                    } //switch 종료

                    if (i == count -1) flag = true;
                }

                if (flag) break;
            }
        }

        ListIterator<String> iterator2 = list.listIterator();
        while (iterator2.hasNext())
            sb.append(iterator2.next());
        System.out.println(sb);
    }
}