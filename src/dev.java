import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * Use Case 6: Queue + Stack Fairness Check
 * * Description:
 * This class demonstrates palindrome validation using two different
 * data structures: Queue (FIFO) and Stack (LIFO).
 */
public class dev {
    /**
     * Application entry point for UC6.
     */
    public static void main(String[] args) {
        // Define the input string to validate
        String input = "civic";

        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();
        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert each character into both structures
        for (char c : input.toCharArray()) {
            queue.add(c);  // Enqueue
            stack.push(c); // Push
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters until the queue becomes empty
        // Queue removes from the front, Stack removes from the back
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}