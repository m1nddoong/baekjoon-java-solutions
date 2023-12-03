import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        if ((-100 <= N && N <= 100) && (-100 <= M && M <= 100)) {
            int[][] arrayA = new int[N][M]; // M행 N열 2차원 배열
            int[][] arrayB = new int[N][M]; // M행 N열 2차원 배열

            // N개의 줄에 행렬 A의 원소 M개 입력
            for (int i = 0; i < N ; i++) {
                for (int j = 0; j < M; j++) {
                    arrayA[i][j] = scanner.nextInt();
                }
            }
            // N개의 줄에 행렬 B의 원소 M개 입력
            for (int i = 0; i < N ; i++) {
                for (int j = 0; j < M; j++) {
                    arrayB[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if ((-100 <= arrayA[i][j] && arrayA[i][j] <= 100) && (-100 <= arrayB[i][j] && arrayB[i][j] <= 100)) {
                        System.out.print(arrayA[i][j]+arrayB[i][j] + " ");
                    }
                }
                System.out.println();
            }

        }
    }
}