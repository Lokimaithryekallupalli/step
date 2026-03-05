public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String original = "level";
        String reverse = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reverse)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is not a Palindrome");
        }
    }
}