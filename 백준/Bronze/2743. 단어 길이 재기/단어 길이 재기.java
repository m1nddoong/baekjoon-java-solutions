import java.util.Scanner;

public class Main {
    public static boolean isAlphabet(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (isAlphabet(s) && (1 <= s.length() && s.length() <= 100)) {
            System.out.println(s.length());
        }
    }
}


