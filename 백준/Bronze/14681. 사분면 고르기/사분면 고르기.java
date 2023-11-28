import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        while ((-1000 <= x && x <= 1000) && (-1000 <= y && y <= 1000) && x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("1");
                break;
            } else if (x < 0 && y > 0) {
                System.out.println("2");
                break;
            } else if (x < 0 && y < 0) {
                System.out.println("3");
                break;
            } else {
                System.out.println("4");
                break;
            }
        }
    }
}