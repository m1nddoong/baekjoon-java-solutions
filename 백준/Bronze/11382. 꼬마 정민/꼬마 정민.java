import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long maxNum = 1;
        for (int i = 0; i < 12; i++) {
            maxNum *= 10;
        }
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        
        if ((1 <= A && A <= maxNum) && (1 <= B && B <= maxNum) && (1 <= C && C <= maxNum)) {
            System.out.println(A+B+C);
        }
    }
}


