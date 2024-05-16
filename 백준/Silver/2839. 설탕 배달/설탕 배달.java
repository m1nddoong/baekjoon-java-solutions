import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (true) {
            // N = 1 or 2 일때
            if (N % 5 == 0) {
                System.out.println(N / 5 + count);
                break;
            } else if (N < 0) {
                System.out.println(-1);
                break;
            }
            N -= 3;
            count++;
        }
    }
}
