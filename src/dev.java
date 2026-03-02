/**
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * Use Case 4: Character Array Based Validation
 */
public class dev {
    public static void main(String[] args) {
        // Declare and initialize the input string
        String input = "radar";

        // Convert the string into a character array
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning
        int start = 0;
        // Initialize pointer at the end
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Continue comparison until pointers cross
        while (start < end) {
            // Compare characters at both ends
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Exit loop early if mismatch found
            }
            start++; // Move front pointer forward
            end--;   // Move back pointer backward
        }

        // Display the result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}