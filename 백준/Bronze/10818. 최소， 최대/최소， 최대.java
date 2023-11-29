import java.util.Scanner;

public class Main {
    public static int maxNum(int[] A) {
        int max = A[0];
        for (int number : A) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    public static int minNum(int[] A) {
        int min = A[0];
        for (int number : A) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if ((1 <= N && N <= 1000000)) {
            int[] A = new int[N];
            for (int i = 0; i < A.length; i++) {
                int intNum = scanner.nextInt();
                if ((-1000000 <= intNum && intNum <= 1000000)) {
                    A[i] += intNum;
                }
            }
            System.out.println(minNum(A) + " " + maxNum(A));
        }
    }
}