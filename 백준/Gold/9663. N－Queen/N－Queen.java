// 참고 : https://st-lab.tistory.com/118

import com.sun.source.tree.ReturnTree;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N-Queen : https://www.acmicpc.net/problem/9663
public class Main {
    public static int count = 0;
    public static int[] arr;
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        nQueen(0);
        System.out.println(count);
    }

    public static void nQueen(int depth) {
        // 퀸 N개를 모두 놓았다면 - 경우의 수 1 증가
        if (depth == N) {
            count++;
            return;
        }

        // 그게 아니라면 - 깊이를 내려가는 중이라면
        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            // 놓을 수 있는 위치일 경우 재귀호출
            if (Possibility(depth)) {
                nQueen(depth + 1);
            }
        }
    }

    // 유망성 판단
    public static boolean Possibility(int col) {
        for (int i = 0; i < col; i++) {
            // 해당 열의 행과 i열의 행이 일치할경우(같은 행이 존재할 경우)
            // 일치하면
            if (arr[col] == arr[i]) {
                return false;
            }

            // 대각선상에 놓여있는 경우
            // (열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우이다)
            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }

        return true;
    }
}
