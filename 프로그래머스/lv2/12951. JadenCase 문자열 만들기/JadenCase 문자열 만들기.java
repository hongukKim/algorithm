class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
    boolean isFirstWord = true;
    
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        
        if (c == ' ') {
            isFirstWord = true;
            answer.append(c);
        } else {
            if (isFirstWord) {
                answer.append(Character.toUpperCase(c));
                isFirstWord = false;
            } else {
                answer.append(Character.toLowerCase(c));
            }
        }
    }
    
    return answer.toString();
    }
}