class Solution {
    public int solution(int a, int b) {
        // 양의 정수 a, b를 문자 a, b로 만들기?
        int answer = 0;
        if ((1 <= a && a <= 10000) && (1 <= b && b <= 10000)) {
            String AB = Integer.toString(a) + Integer.toString(b);
            int twoAB = 2 * a * b;

            if (Integer.parseInt(AB) >= twoAB) {
                answer = Integer.parseInt(AB);
            } else {
                answer = twoAB;
            }
        }
        return answer;
    }
}