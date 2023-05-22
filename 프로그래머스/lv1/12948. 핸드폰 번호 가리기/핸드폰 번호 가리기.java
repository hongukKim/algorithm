class Solution {
    public String solution(String phone_number) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("*".repeat(phone_number.length() - 4));
        String substring = phone_number.substring(phone_number.length() - 4, phone_number.length());
        stringBuilder.append(substring);

        return stringBuilder.toString();
    }
}