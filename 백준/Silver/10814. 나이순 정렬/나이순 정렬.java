import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Person implements Comparable<Person>{
    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return this.age + " " + this.name;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = sc.nextInt();
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            list.add(new Person(age, name));
        }

        Collections.sort(list);
        for (Person person : list) {
            System.out.println(person);
        }
    }
}