import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // N개의 정수가 주어짐
        int index = 0;

        if (1 <= N && N <= 100) {
            int[] numbers = new int[N];
            for (int i = 0; i < N; i++) {
                int intNum = scanner.nextInt();
                numbers[i] += intNum;
            }
            int v = scanner.nextInt();  // 2 입력
            if (-100 <= v && v <= 100) {
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] == v) {
                        index++;
                    }
                }
            }
        }
        System.out.print(index);
    }
}