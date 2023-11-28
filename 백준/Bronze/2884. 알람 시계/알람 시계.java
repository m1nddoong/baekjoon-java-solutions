import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        while (0 <= H && H <= 23 && 0 <= M && M <= 59) {
            if (H == 0 && M < 45) {
                System.out.println(String.format("23 %d", 60 + M - 45));
                break;
            } else if (H != 0 && M < 45) {
                System.out.println(String.format("%d %d", H - 1, 60 + M - 45));
                break;
            } else {
                System.out.println(String.format("%d %d", H, M - 45));
                break;
            }
        }
    }
}