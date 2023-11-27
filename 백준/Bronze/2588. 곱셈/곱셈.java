import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // (3)
        int three = A * (B % 10);
        System.out.println(three);

        // (4)
        int four = A * (B % 100 - B % 10);
        System.out.println(four / 10);

        // (5)
        int five = A * (B - (B % 100));
        System.out.println(five  / 100);

        // (6)
        System.out.println(three + four + five);
    }
}
