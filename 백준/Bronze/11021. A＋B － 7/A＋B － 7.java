import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] sum = new int[T];

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            sum[i] = A+B;
        }
        for (int i = 0; i < T; i++) {
            System.out.println(String.format("Case #%d: %d", i + 1, sum[i]));
        }
    }
}