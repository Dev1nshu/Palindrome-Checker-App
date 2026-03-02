import java.util.Scanner;

public class dev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // UC3 Key Concept: String Immutability
        // Each time we add a character to 'reversed', a new String object is created.
        String reversed = "";

        // Loop: Iterate from the last index to the first
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i); // String Concatenation (+)
        }

        // Use equals() to compare content, not memory references
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }

        scanner.close();
    }
}