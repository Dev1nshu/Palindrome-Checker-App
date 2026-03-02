/**
 * SERVICE CLASS - PalindromeService
 * Encapsulates the palindrome validation logic.
 */
class PalindromeService {
    /**
     * UC11: Checks if a string is a palindrome.
     * Demonstrates Encapsulation by hiding the logic inside this method.
     * * @param input The string to check
     * @return true if palindrome, otherwise false
     */
    public boolean checkPalindrome(String input) {
        if (input == null) return false;

        // Using the two-pointer technique for internal logic
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

/**
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * Use Case 11: Object-Oriented Palindrome Service
 */
public class dev {
    /**
     * Application entry point for UC11.
     */
    public static void main(String[] args) {
        // Create an instance of the service class (OOP approach)
        PalindromeService service = new PalindromeService();

        String input = "madam";

        // Invoke the encapsulated method
        boolean result = service.checkPalindrome(input);

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}