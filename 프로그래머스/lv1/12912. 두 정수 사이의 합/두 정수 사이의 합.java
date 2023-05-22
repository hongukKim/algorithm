class Solution {
    public long solution(int a, int b) {
        if (a == b) {
            return a;
        }

        int smaller = Math.min(a, b);
        int larger = Math.max(a, b);
        long sum = 0;

        for (int i = smaller; i <= larger; i++) {
            sum += i;
        }

        return sum;
    }
}