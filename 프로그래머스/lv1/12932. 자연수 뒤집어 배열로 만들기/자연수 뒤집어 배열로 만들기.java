import java.util.Arrays;
class Solution {
    public int[] solution(long n) {
        int[] answer = new int[5];
        String str = Long.toString(n);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            answer[i] = Integer.parseInt(String.valueOf(ch));
        }
        return Arrays.stream(answer).sorted().toArray();
    }
}