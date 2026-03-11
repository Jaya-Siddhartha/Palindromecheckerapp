import java.util.Scanner;

// Service class (encapsulates palindrome logic)
class PalindromeChecker {

    public boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

// Main application class
public class PalindromCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}