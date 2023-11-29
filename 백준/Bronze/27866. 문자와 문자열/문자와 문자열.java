import java.util.Scanner;

public class Main {
    public static boolean isAlphabet(String S) {
        for (char c : S.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int i = scanner.nextInt();
        if (isAlphabet(S) && (1 <= i && i <= S.length())) {
            System.out.println(S.charAt(i-1));
        }
    }
}


