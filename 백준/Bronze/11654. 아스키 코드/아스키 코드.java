import java.util.Scanner;

public class Main {
    public static boolean isAlphabet (String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNumber(String s) {
        int number = Integer.parseInt(s);
        if (0 <= number && number <= 9) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (isAlphabet(s) || isNumber(s)) {
            // String 을 char로 변환하고 int로 타입 변환
            // System.out.println((int)a.charAt(0));
            System.out.println((int)s.charAt(0));
        }
    }
}


