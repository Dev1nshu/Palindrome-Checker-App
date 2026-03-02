/**
 * INTERFACE - PalindromeStrategy
 * =========================================================================
 * This interface defines a contract for all palindrome checking algorithms.
 * Any new algorithm must implement this interface and provide its own
 * validation logic.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * STRATEGY CLASS - StackStrategy
 * =========================================================================
 * Implements palindrome validation using a Stack (LIFO behavior).
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

/**
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * =========================================================================
 * Description:
 * This class demonstrates how different algorithms can be selected
 * dynamically at runtime using the Strategy Design Pattern.
 */
public class dev {
    public static void main(String[] args) {
        String input = "racecar";

        // Inject the strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        // Execute the selected algorithm
        boolean result = strategy.check(input);

        // Display results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}