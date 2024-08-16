import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<Long, Long> ch = new HashMap<>();
    static long a, c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        long b = sc.nextInt();
        c = sc.nextInt();

        System.out.println(sol(b));
    }

    // 나머지를 반환하는 메소드
    static long sol(long b) {
        if (ch.containsKey(b)) return ch.get(b);
        else {
            if (b == 1) {
                long tmp = a % c;
                ch.put(b, tmp);
                return ch.get(b);
            } else {
                long minusValue = b / 2;
                long restValue = b - minusValue;

                long sol1 = 0;
                long sol2 = 0;

                if (!ch.containsKey(minusValue) && !ch.containsKey(restValue)) {
                    sol1 = sol(minusValue);
                    sol2 = sol(restValue);

                    ch.put(minusValue, sol1);
                    ch.put(restValue, sol2);
                } else if (!ch.containsKey(minusValue)) {
                    sol1 = sol(minusValue);
                    sol2 = ch.get(restValue);

                    ch.put(minusValue, sol1);
                } else if (!ch.containsKey(restValue)) {
                    sol1 = ch.get(minusValue);
                    sol2 = sol(restValue);

                    ch.put(restValue, sol2);
                } else {
                    sol1 = ch.get(minusValue);
                    sol2 = ch.get(restValue);
                }

                long tmp = (sol1 * sol2) % c;
                ch.put(b, tmp);
                return tmp;
            }
        }
    }
}
