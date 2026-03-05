public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String str = "racecar";

        // Convert string to character array
        char[] arr = str.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}