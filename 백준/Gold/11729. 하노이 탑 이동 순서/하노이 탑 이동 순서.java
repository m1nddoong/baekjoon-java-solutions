// 하노이 탑 이동 순서 : https://www.acmicpc.net/problem/11729

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static StringBuilder towerBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        // 점화식을 이용해 이동횟수를 먼저 넣어준다.
        // 하노이 탑의 최소 이동 횟수 : 2^n - 1
        towerBuilder.append((int) (Math.pow(2, n) - 1)).append('\n');
        hanoi(n, 1, 3, 2);
        System.out.println(towerBuilder);
    }

    private static void hanoi(
            // 하노이의 탑의 높이
            int height,
            // 현재 출발하고자 하는 기둥
            int start,
            // 목표로 하는 기둥
            int end,
            // 제 3의 기둥
            int other
    ) {

        // 높이가 1이라면, start -> end 로 이동시키면 된다.
        if (height == 1) {
            towerBuilder.append(start + " " + end + '\n');
        }

        // 높이가 2 이상이면?
        else {
            // 1. 한 단계 아래 높이의 원반들을 other 로 이동한다.
            hanoi(height - 1, start, other, end);
            // 2. 제일 아래 원반을 end로 이동한다.
            towerBuilder.append(start + " " + end + '\n');
            // 3. other 에 이동된 한단계 아래 높이의 원반들을 end로 이동한다.
            hanoi(height- 1, other, end, start);
        }
    }
}
