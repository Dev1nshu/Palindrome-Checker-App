import java.util.Stack;

/**
 * INTERFACE - Defining the contract for algorithms
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * STRATEGY - Implementation using a Stack (LIFO)
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

/**
 * MAIN CLASS - Benchmarking the performance
 */
public class dev {
    public static void main(String[] args) {
        String input = "racecar";

        // 1. Initialize the strategy
        PalindromeStrategy stackStrategy = new StackStrategy();

        // 2. Capture execution start time in nanoseconds
        long startTime = System.nanoTime();

        // 3. Execute the algorithm
        boolean result = stackStrategy.check(input);

        // 4. Capture execution end time
        long endTime = System.nanoTime();

        // 5. Calculate total duration
        long duration = (endTime - startTime);

        // Display benchmarking results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time (ns) : " + duration);
    }
}