import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// 집합과 맵 : 서로 다른 부분 문자열의 개수 - https://www.acmicpc.net/problem/11478
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();

        String str = br.readLine();
        for (int i = 0; i < str.length()+1; i++) {
            for (int j = i; j < str.length()+1; j++) {
                // System.out.println(str.substring(i, j));
                set.add(str.substring(i, j));

            }
        }
        System.out.println(set.size() - 1);
    }
}
