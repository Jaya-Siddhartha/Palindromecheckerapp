import java.util.Stack;

public class PalindromCheckerApp {

    // UC5: Stack-Based Palindrome Checker
    public static void uc5Stack() {
        String word = "noon"; // hardcoded input
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters to form reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare original and reversed
        boolean isPalindrome = word.equals(reversed);

        // Print result
        System.out.println("Input: " + word);
        System.out.println("Is palindrome? : " + isPalindrome);
    }

    // Main method
    public static void main(String[] args) {
        uc5Stack();
    }
}