import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        while ((-10000 <= A && A <= 10000) && (-10000 <= B && B <= 10000)) {
            if (A > B) {
                System.out.print(">");
                break;
            } else if (A < B) {
                System.out.print("<");
                break;
            } else {
                System.out.print("==");
                break;
            }
        }
    }
}
