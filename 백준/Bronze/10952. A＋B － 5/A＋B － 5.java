import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            String [] numbers = input.split(" ");
            Integer first = Integer.parseInt(numbers[0]);
            Integer second = Integer.parseInt(numbers[1]);
            if (first == 0 && second == 0) break;
            firstList.add(first);
            secondList.add(second);
        }
        for (int i = 0; i < firstList.size(); i++) {
            System.out.println(firstList.get(i) + secondList.get(i));
        }
    }
}