import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 3개의 눈 입력
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        // 상금
        int reward = 0;

        while ((1 <= a && a <= 6) && (1 <= b && b <= 6) && (1 <= c && c <= 6)) {
            // 상금 출력
            if (a == b && b == c) {
                reward = 10000 + a * 1000;
                break;
            } else if (a == b || a == c || b == c) {
                int same = a == b ? a : c;
                reward = 1000 + same * 100;
                break;
            } else {
                int max = a > b ? a : b;
                max = max > c ? max : c;
                reward = max * 100;
                break;
            }
        }
        System.out.print(reward);
    }
}
