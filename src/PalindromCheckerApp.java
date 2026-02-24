public class PalindromCheckerApp {
        public static void main(String[] args) {
            String original = "level";  // hardcoded string to check
            String reversed = "";        // will store reversed string

            // Reverse the string using a for loop
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed += original.charAt(i);  // concatenate characters
            }

            // Compare original and reversed
            if (original.equals(reversed)) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is NOT a palindrome.");
            }
        }
    }