<<<<<<< HEAD
import java.util.*;

public class PalindromCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters to Queue and Stack
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);      // Enqueue
            stack.push(ch);     // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue from queue and pop from stack
        while(!queue.isEmpty()) {
            char qChar = queue.remove();  // Dequeue
            char sChar = stack.pop();     // Pop

            if(qChar != sChar) {
                isPalindrome = false;
                break;
            }
        }

        // Result
        if(isPalindrome) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        sc.close();
    }
}
=======
public class PalindromCheckerApp {
}
>>>>>>> 6ca12f6da22575f174b4097fa1989a1bc014baba
