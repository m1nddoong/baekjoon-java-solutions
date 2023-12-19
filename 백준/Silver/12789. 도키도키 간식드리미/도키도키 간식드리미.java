import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

// 도키도키 간식드리미

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 학생 수 N
        int N = Integer.parseInt(reader.readLine());

        Queue<Integer> q = new LinkedList<>(); // 대기열
        Stack<Integer> s = new Stack<>(); // 추가 대기열

        StringTokenizer st = new StringTokenizer(reader.readLine());

        while (st.hasMoreTokens()) {
            q.offer(Integer.parseInt(st.nextToken()));
        }

        int num = 1;
        while (!q.isEmpty()) {
            if (q.peek() == num) {
                q.poll();
                num++;
            } else if (!s.empty() && s.peek() == num) {
                s.pop();
                num++;
            } else {
                s.push(q.poll());
            }
        }
        while (!s.isEmpty()) {
            if (s.peek() == num) {
                s.pop();
                num++;
            } else {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
}

