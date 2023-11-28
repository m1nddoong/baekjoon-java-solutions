import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int H = 0;
        int M = 0;
        /*
         C분을 A시 B분에 모두 더한 후

         A시 = (현재 A시) + (C를 60으로 나눈 몫) + (추가시간)
          - 추가시간 = 현재 B분에 C를 B로 나눈 나머지를 더한 값을 60으로 나눈 몫

         B분 = 추가시간을 뺸 나머지
         - 추가시간을 뺸 나머지 = 현재 B분에 C를 B로 나눈 나머지를 더한 값을 60으로 나눈 나머지
         */
        
        while ((0 <= A && A <= 23 && 0 <= B && B <= 59) && (0 <= C && C <= 10000)) {
            // 추가시간을 더한 A의 결과가 24시를 넘어갈 때 
            if ((A + C / 60 + ((B + C % 60) / 60) >= 24)) {
                H = (A + C / 60 + ((B + C % 60) / 60)) - 24;
                M = (B + C % 60) % 60;
                System.out.println(String.format("%d %d", H, M));
                break;
            } else {
                H = (A + C / 60 + ((B + C % 60) / 60));
                M = (B + C % 60) % 60;
                System.out.println(String.format("%d %d", H, M));
                break;
            }
        }
    }
}