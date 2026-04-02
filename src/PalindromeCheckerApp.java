public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";
        String reversed = "";

        // Reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);

        if (input.equals(reversed)) {
            System.out.println("It is a Palindrome: true");
        } else {
            System.out.println("It is a Palindrome: false");
        }
    }
}