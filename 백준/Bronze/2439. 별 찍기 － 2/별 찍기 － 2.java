import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (1 <= N && N <= 100) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N-(i+1); j++) {
                    System.out.print(" ");
                }
                for (int j = N-(i+1) ; j < N ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}