import java.util.Comparator;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int[] sortedArray = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        ;
        int max = 0;
        for (int j : sortedArray) {
            if (j > max) {
                max = j;
            }
        }

        return sortedArray[0] + " " + sortedArray[sortedArray.length -1];
    }
}