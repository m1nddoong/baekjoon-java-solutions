import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long X = scanner.nextInt();
        int N = scanner.nextInt();
        int[] a = new int[N];   // 물건의 가격
        int[] b = new int[N];   // 물건이 개수
        int[] sum = new int[N]; // 물건별로 구매한 금액
        int totalPrice = 0;     // 최종 금액

        if ((1 <= X && X <= 1000000000) && (1 <= N && N <= 100)) {
            for (int i = 0; i < N; i++) {
                a[i] = scanner.nextInt();
                b[i] = scanner.nextInt();
                sum[i] += a[i] * b[i];
            }
            for (int i = 0; i < N; i++) {
                if ((1 <= a[i] && a[i] <= 1000000) && (1 <= b[i] && b[i] <= 10)) {
                    totalPrice += sum[i];
                }
            }
            if (totalPrice == X) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}


