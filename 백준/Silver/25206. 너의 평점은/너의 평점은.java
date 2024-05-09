import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 너의 평점은 : https://www.acmicpc.net/problem/25206
public class Main {
    public static double majorGpa = 0; // 전공과목별 (학점 × 과목평점)의 합
    public static double cGpa = 0; // 학점 총합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            String str = br.readLine();
            // 과목평점이 P 이면 계산에서 제외
            if (str.split(" ")[2].equals("P")) {
                continue;
            }
            // 학점
            double credit = Double.parseDouble(str.split(" ")[1]);
            // 과목 평점
            double gpa = gpaTransducer(str.split(" ")[2]);
            cGpa += credit;
            majorGpa += credit * gpa;
        }
        String result = String.format("%.6f", majorGpa / cGpa);
        System.out.println(result);

    }

    public static double gpaTransducer(String gpa) {
        switch (gpa) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return -1;
        }
    }
}


