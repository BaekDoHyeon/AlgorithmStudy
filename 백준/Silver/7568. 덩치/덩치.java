import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Body {
    int weight;
    int height;

    Body(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = sc.nextInt();
        List<Body> list = new ArrayList<>();
        int[] ranks = new int[N];

        for (int i = 0; i < N; i++)
            list.add(new Body(sc.nextInt(), sc.nextInt()));

        for (int i = 0 ; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++)
                if (list.get(i).weight < list.get(j).weight && list.get(i).height < list.get(j).height) rank++;
            ranks[i] = rank;
        }

        for (int rank : ranks)
            System.out.print(rank + " ");
    }
}