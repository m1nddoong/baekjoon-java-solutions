import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String pattern = "long ";
        int count = N / 4;
        while ((N % 4 == 0) && (4 <= N && N <= 1000)) {
            for (int i = 0; i < count; i++) {
                System.out.print(pattern);
            }
            System.out.print("int");
            break;
        }
    }
}