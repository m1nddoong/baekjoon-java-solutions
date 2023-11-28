import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] sum = new int[T];
        int[] A = new int[T];
        int[] B = new int[T];

        for (int i = 0; i < T; i++) {
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
            sum[i] = A[i]+B[i];
        }
        for (int i = 0; i < T; i++) {
            System.out.println(String.format("Case #%d: %d + %d = %d", i + 1, A[i], B[i], sum[i]));
        }
    }
}