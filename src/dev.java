import java.util.Scanner; // Import the Scanner class

public class dev {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String str = scanner.nextLine(); // Reads the user's input

        String reversedStr = "";

        // Logic to reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }

        // Check if palindrome
        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }

        scanner.close(); // Good practice to close the scanner
    }
}