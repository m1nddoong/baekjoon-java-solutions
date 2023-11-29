import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> integerList = new ArrayList<>();
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 숫자의 개수
        scanner.nextLine(); // 다 못쓴 개행 소모해주기

        if (1 <= N && N <= 100) {
            String inputNumber = scanner.nextLine();
            for (char c : inputNumber.toCharArray()) {
                // System.out.println((int) c - 48); // int 로 캐스팅 하는 과정에서 차이가 발생 : 5 -> 53 , 4 -> 52
                sum += (int) c - 48;
            }
            System.out.println(sum);
        }
    }
}


