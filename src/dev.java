/**
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * Use Case 10: Normalized Palindrome Validation
 * =========================================================================
 * Description:
 * This class validates a palindrome after preprocessing the input string.
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 * This ensures the palindrome check is logical rather than character-format dependent.
 */
public class dev {
    /**
     * Application entry point for UC10.
     */
    public static void main(String[] args) {
        // Example input with spaces and mixed casing
        String input = "A man a plan a canal Panama";

        // Preprocessing: Remove all non-alphanumeric characters and convert to lowercase
        // [^a-zA-Z0-9] is a Regular Expression for "anything that isn't a letter or number"
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare characters from both ends using normalization logic
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit early if mismatch found
            }
        }

        // Display the results
        System.out.println("Original Input : " + input);
        System.out.println("Normalized     : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}