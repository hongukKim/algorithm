import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> yearningScores = new HashMap<>();

        // 그리움 점수를 인물 이름을 기준으로 매핑
        for (int i = 0; i < name.length; i++) {
            yearningScores.put(name[i], yearning[i]);
        }

        int[] scores = new int[photo.length];

        // 각 사진의 추억 점수 계산
        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (String person : photo[i]) {
                if (yearningScores.containsKey(person)) {
                    score += yearningScores.get(person);
                }
            }
            scores[i] = score;
        }

        return scores;
    }
}
