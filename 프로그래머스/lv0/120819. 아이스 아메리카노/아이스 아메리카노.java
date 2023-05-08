class Solution {
    public int[] solution(int money) {
        int[] answer = {0,0};
        int coffee = 5500;
        int count = 0;
        while (money >= coffee) {
            money = money - coffee;
            count++;
        }
        answer[0] = count;
        answer[1] = money;
        return answer;
    }
}
