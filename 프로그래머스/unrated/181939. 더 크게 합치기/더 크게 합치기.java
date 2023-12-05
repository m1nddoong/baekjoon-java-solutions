class Solution {
    public int solution(int a, int b) {
        // 양의 정수 a, b를 문자 a, b로 만들기?
        String ab = Integer.toString(a) + Integer.toString(b);
        String ba = Integer.toString(b) + Integer.toString(a);
        int answer = 0;

        if (Integer.parseInt(ab) < Integer.parseInt(ba)) {
            answer = Integer.parseInt(ba);
        } else {
            answer = Integer.parseInt(ab);
        }
        return answer;
    }
}