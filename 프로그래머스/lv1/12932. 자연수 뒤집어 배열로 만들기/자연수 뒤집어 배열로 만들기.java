import java.util.Arrays;
class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int [] answer = new int[str.length()];
        int num = 0;
        while(n > 0){
            answer[num] = (int)(n % 10);
            n /= 10;
            num++;
        }
       
        return answer;
    }
}