import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (1 <= N && N <= 9) {
            for (int i = 0; i < 9; i++) {
                System.out.println(String.format("%d * %d = %d", N, i+1, N*(i+1)));
            }
        }
    }
}
