import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        if ((1 <= N && N <= 10000) && (1 <= X && X <= 10000)) {
            int[] A = new int[N];
            for (int i = 0; i < A.length; i++) {
                A[i] += scanner.nextInt();
            }
            for (int number : A) {
                if (number < X) {
                    System.out.print(number + " ");
                }
            }
        }
    }
}