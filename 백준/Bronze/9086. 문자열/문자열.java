import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // 대소문자 영문이면 true
    public static boolean isAlphabet(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(); // String 을 담는 리스트

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스의 개수 T
        scanner.nextLine(); // 개행 비워주기?

        if (1 <= T && T <= 10) {
            for (int i = 0; i < T; i++) {
                String s = scanner.nextLine(); // 3번 입력 받기
                if (isAlphabet(s)) stringList.add(s); // 대소문자 영문이면 리스트에 추가
            }
        }
        for (int i = 0; i < T; i++) {
            String str = stringList.get(i);
            // System.out.println(str.charAt(0) + str.charAt(str.length() - 1)); // 왜 숫자가 나오지...?
            
            // 리스트 요소 str 을 각각 배열로 만들고, 0번인덱스와 마지막 인덱스를 출력
            System.out.println(String.format("%s%s", str.toCharArray()[0], str.toCharArray()[str.length()-1]));
            
        }
    }
}


