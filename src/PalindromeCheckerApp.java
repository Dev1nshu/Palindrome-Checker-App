import java.util.Stack;

// MAIN CLASS
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        PalindromeStrategy strategy = new StackStrategy();

        long startTime = System.nanoTime();

        boolean result = strategy.check(input);

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
        System.out.println("Execution Time: " + executionTime + " ns");
    }
}

// STRATEGY INTERFACE
interface PalindromeStrategy {
    boolean check(String input);
}

// STACK STRATEGY
class StackStrategy implements PalindromeStrategy {

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