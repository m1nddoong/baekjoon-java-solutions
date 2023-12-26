import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        List<Integer> array = new ArrayList<>();
        while (st.hasMoreTokens()) {
            array.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(array);
        System.out.println(array.get(0) * array.get(n-1));

    }
}
