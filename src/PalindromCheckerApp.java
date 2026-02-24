public class PalindromCheckerApp {
    // Method to check if a string is palindrome
        public static boolean isPalindrome(String str) {
            String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
            StringBuilder reversed = new StringBuilder(cleanStr).reverse();
            return cleanStr.equals(reversed.toString());
        }

        // main method - entry point
        public static void main(String[] args) {
            String hardcodedWord = "madam"; // hardcoded string

            if (isPalindrome(hardcodedWord)) {
                System.out.println(hardcodedWord + " is a palindrome.");
            } else {
                System.out.println(hardcodedWord + " is NOT a palindrome.");
            }
        }
    }