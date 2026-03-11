import java.util.*;

public class PalindromCheckerApp {

    // Stack-based palindrome check
    public static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray())
            stack.push(c);

        for(char c : str.toCharArray()) {
            if(c != stack.pop())
                return false;
        }

        return true;
    }

    // Deque-based palindrome check
    public static boolean dequePalindrome(String str) {
        Deque<Character> deque = new LinkedList<>();

        for(char c : str.toCharArray())
            deque.addLast(c);

        while(deque.size() > 1) {
            if(!deque.removeFirst().equals(deque.removeLast()))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        // Stack performance
        long start1 = System.nanoTime();
        boolean stackResult = stackPalindrome(str);
        long end1 = System.nanoTime();

        // Deque performance
        long start2 = System.nanoTime();
        boolean dequeResult = dequePalindrome(str);
        long end2 = System.nanoTime();

        System.out.println("\nStack Result: " + (stackResult ? "Palindrome" : "Not Palindrome"));
        System.out.println("Stack Execution Time: " + (end1 - start1) + " ns");

        System.out.println("\nDeque Result: " + (dequeResult ? "Palindrome" : "Not Palindrome"));
        System.out.println("Deque Execution Time: " + (end2 - start2) + " ns");

        sc.close();
    }
}