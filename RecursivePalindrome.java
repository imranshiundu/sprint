package sprint;

public class RecursivePalindrome {
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String cleaned = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if (cleaned.length() <= 1) {
            return true;
        }
        return isPalindromeHelper(cleaned, 0, cleaned.length() - 1);
    }

    private boolean isPalindromeHelper(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeHelper(str, start + 1, end - 1);
    }
}
