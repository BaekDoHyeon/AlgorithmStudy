import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Pos implements Comparable<Pos> {
    int x;
    int y;

    Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pos o) {
        if (this.y == o.y) return this.x - o.x;
        return this.y - o.y;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = sc.nextInt();

        List<Pos> list = new ArrayList<>();
        for (int i = 0; i < N; i++) list.add(new Pos(sc.nextInt(), sc.nextInt()));
        Collections.sort(list);

        for (Pos pos : list) {
            System.out.println(pos.x + " " + pos.y);
        }
    }
}