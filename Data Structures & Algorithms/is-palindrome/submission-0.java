class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(cleaned);
        String result = sb.reverse().toString();
        return result.equals(cleaned);
    }
}
