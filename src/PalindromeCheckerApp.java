import java.util.Stack;

// MAIN CLASS
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Inject strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
    }
}

// STRATEGY INTERFACE
interface PalindromeStrategy {

    boolean check(String input);
}

// CONCRETE STRATEGY (Stack Based)
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