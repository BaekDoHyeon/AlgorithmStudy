import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값
        Scanner sc = new Scanner(System.in);

        int subjectCount = 20; // P/F 과목의 P 등급일 경우 1씩 뺀다.
        double result = 0.0;
        double sum = 0.0; //학점의 총합

        //과목명, 학점, 등급을 저장하는 배열 선언
        String[] subjects = new String[20];
        Double[] credits = new Double[20];
        String[] ratings = new String[20];

        //등급별 과목평점을 보관하는 컬렉션
        Map<String, Double> grade = new HashMap<>() {{
            put("A+", 4.5);
            put("A0", 4.0);
            put("B+", 3.5);
            put("B0", 3.0);
            put("C+", 2.5);
            put("C0", 2.0);
            put("D+", 1.5);
            put("D0", 1.0);
            put("F", 0.0);
        }};

        //과목명, 학점, 과목평점(등급) 을 순서대로 입력받는다. -> 20번 반복
        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            Double credit = sc.nextDouble();
            String rating = sc.next();

            subjects[i] = subject;
            credits[i] = credit;
            ratings[i] = rating;
        }

        for (int i = 0; i < 20; i++) {
            if (!(ratings[i].equals("P"))) {
                double subjectAvg = credits[i] * grade.get(ratings[i]);
                sum += credits[i];
                result += subjectAvg;
            }
        }
        System.out.println(result/sum);
    }
}