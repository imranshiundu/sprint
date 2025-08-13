package sprint;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
            if (input == null) return false;

                    // Remove non-alphanumeric characters and convert to lowercase
                            StringBuilder cleaned = new StringBuilder();
                                    for (char c : input.toCharArray()) {
                                                if (Character.isLetterOrDigit(c)) {
                                                                cleaned.append(Character.toLowerCase(c));
                                                                            }
                                                                                    }

                                                                                            // Check if cleaned string is a palindrome
                                                                                                    String cleanedStr = cleaned.toString();
                                                                                                            String reversedStr = cleaned.reverse().toString();

                                                                                                                    return cleanedStr.equals(reversedStr);
                                                                                                                        }
                                                                                                                        }