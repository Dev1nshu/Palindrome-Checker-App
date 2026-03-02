/**
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * Use Case 9: Recursive Palindrome Checker
 * =========================================================================
 * Description:
 * This class validates a palindrome using recursion.
 * Characters are compared from outer positions moving inward
 * using recursive calls until a base condition is met.
 */
public class dev
{
    /**
     * Application entry point for UC9.
     */
    public static void main(String[] args) {
        String input = "racecar";

        // Call the recursive method
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is a palindrome.
     * * @param s      Input string
     * @param start  Starting index
     * @param end    Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Condition: All characters matched or pointers crossed
        if (start >= end) {
            return true;
        }

        // Check if characters at current positions match
        if (s.charAt(start) != s.charAt(end)) {
            return false; // Mismatch found
        }

        // Recursive Call: Move inward
        return check(s, start + 1, end - 1);
    }
}