import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxNums = nums.length / 2;
        int uniqueNums = set.size();

        return Math.min(maxNums, uniqueNums);
    }
}