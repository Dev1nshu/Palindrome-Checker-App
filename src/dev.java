import java.util.ArrayDeque;
import java.util.Deque;

/**
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * Use Case 7: Deque Based Optimized Palindrome Checker
 * * Description:
 * This class validates a palindrome using a Deque (Double Ended Queue).
 * It enables direct comparison of the first and last characters by
 * removing elements from both ends simultaneously.
 */
public class dev
{
    /**
     * Application entry point for UC7.
     */
    public static void main(String[] args) {
        // Define the input string to validate
        String input = "refer";

        // Create a Deque to store characters
        // ArrayDeque is an efficient implementation for front/back access
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character of the string into the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists in the deque
        // Optimized: We compare the front and back characters directly
        while (deque.size() > 1) {
            // removeFirst() gets the front, removeLast() gets the rear
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break; // Exit early if mismatch is found
            }
        }

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}