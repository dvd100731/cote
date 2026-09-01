class Solution {
    public int solution(int a, int b) {
        int answer = Integer.parseInt("" + a + b);
        int ab = Integer.parseInt("" + b + a);
        return Math.max(answer, ab);
    }
}