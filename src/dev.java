import java.util.Stack;

/**
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * Use Case 5: Stack Based Palindrome Checker
 * * Description:
 * This class validates a palindrome using a Stack data structure
 * which follows the LIFO (Last In First Out) principle.
 */
public class dev {
    /**
     * Application entry point for UC5.
     */
    public static void main(String[] args) {
        // Declare and initialize the input string
        String input = "noon";

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        // Stack naturally reverses the order of elements
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Iterate again through original string and compare with popped characters
        // Pop Operation: Removes characters from the stack in reverse order
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break; // Exit early if mismatch found
            }
        }

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}