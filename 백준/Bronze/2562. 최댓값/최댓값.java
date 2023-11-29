import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[9];
        for (int i = 0; i < 9; i++) {
            int inputNum = scanner.nextInt();
            if (1 <= inputNum && inputNum < 100) {
                numbers[i] += inputNum;
            }
        }
        int maxNumber = numbers[0];
        int maxIndex = 0;
        for (int i = 0; i < 9; i++) {
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println(maxNumber);
        System.out.println(maxIndex+1);
    }
}