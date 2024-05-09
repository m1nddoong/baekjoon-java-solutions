import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 세로 읽기 : https://www.acmicpc.net/problem/10798
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] matrix = new char[5][15]; // 5행 15열
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            char[] charArray = str.toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                matrix[i][j] = charArray[j];
            }
        }
        verticalRead(matrix);

    }

    public static void verticalRead(char[][] matrix) {
        StringBuilder sb = new StringBuilder();
        // 0행0열 1행0열 2행0열 ...
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                char c = matrix[j][i];
                if (c != '\0') {
                    sb.append(c);
                }
            }
        }
        System.out.println(sb);
    }
}
