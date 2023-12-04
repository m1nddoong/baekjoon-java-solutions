import java.util.Scanner;

public class Solution {

    public static String solution(String str1, String str2) {
        // 먼저 어떻게 풀어야 할까를 주석으로 표현하자
        String answer = "";
        // string.toCharArray()
        // 문자열을 구성하는 char 배열을 반환하는 메서드
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        // 1. str1 의 길이만큼 반복한다
        for (int i = 0; i < str1.length(); i++) {
            // 2. str1의 i번째 글자를 answer에 덧붙인다.
            answer += chars1[i];
            // 3. str2의 i번째 글자를 answer에 덧붙인다.
            answer += chars2[i];
        }
        // 4. 답을 반환한다.
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if (str1.length() == str2.length()) {
            System.out.println(solution(str1, str2));
        }
    }
}