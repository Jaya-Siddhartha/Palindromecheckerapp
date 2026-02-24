public class PalindromCheckerApp {
    public static void main(String[] args) {
            String original = "rader"; // hardcoded input string
            char[] chars = original.toCharArray(); // convert to character array

            boolean isPalindrome = true; // flag to track palindrome
            int start = 0;               // start pointer
            int end = chars.length - 1;  // end pointer

            // Two-pointer approach
            while (start < end) {
                if (chars[start] != chars[end]) {
                    isPalindrome = false; // mismatch found
                    break;
                }
                start++;
                end--;
            }

            // Print result
            System.out.println("Input: " + original);
            System.out.println("Is palindrome? : " + isPalindrome);
        }
    }