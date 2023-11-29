import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 바구니 N개 (1이상)
        int M = scanner.nextInt(); // 공을 몇번 넣을 것인지
        int[] basket = new int[N]; // N개의 크기를 갖는 바구니 생성
        if ((1 <= N && N <= 100) && (1 <= M && M <= 100)) {
            for (int m = 0; m < M; m++) { // M번 공을 넣을 건데
                int i = scanner.nextInt(); // 1번 바구니부터
                int j = scanner.nextInt(); // 2번 바구니까지
                int k = scanner.nextInt(); // 3번 공을 넣기
                for (int l = i; l <= j; l++) {
                    // 1번 바구니는 사실상 0번 인덱스의 배열 값이므로 l-1
                    basket[l-1] = k; 
                }
            }
            for (int number : basket) {
                System.out.print(number + " ");
            }
        }
    }
}