import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        // 스택
        Stack<String> rubberDuck = new Stack<>();

        // 입력 받기
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        if (reader.readLine().equals("고무오리 디버깅 시작")) {
            // 입력 줄 개수 세기
            int lineCount = 1;

            // 줄이 102보다 클떄동안 반복
            while (lineCount <= 102) {
                // 입력 받기
                String input = reader.readLine();

                // "문제" 를 입력했다면 "문제" push
                if (input.equals("문제")) {
                    rubberDuck.push("문제");
                }
                // "고무오리" 입력 받았는데
                else if (input.equals("고무오리")) {
                    // "문제"가 없으면 두문제 추가
                    if (rubberDuck.isEmpty()) {
                        rubberDuck.push("문제");
                        rubberDuck.push("문제");
                    }
                    // "문제" 가 있으면 pop
                    else {
                        rubberDuck.pop();
                    }
                }
                // "고무오리 디버깅" 입력받았다면
                else if (input.equals("고무오리 디버깅 끝")) {
                    break;
                }
                // 줄 추가
                lineCount++;
            }

            if (rubberDuck.isEmpty()) {
                System.out.println("고무오리야 사랑해");
            }
            else {
                System.out.println("힝구");
            }
        }
    }
}
