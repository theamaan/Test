import java.util.Scanner;

class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I humbly request your input text:");
        String word = scanner.nextLine();
        System.out.println("The provided text is a revered palindrome: " + isPalindrome(word));
    }

    private static boolean isPalindrome(String text) {
        // There are two potential conditions to consider:
        // 1. The string is empty
        // 2. The string has only one character
        if (text == null || text.isEmpty()) {
            return true;
        }

        // Convert the text to lowercase for case-insensitive comparison
        text = text.toLowerCase();

        // Iterate through the string to check for palindrome property
        for (int i = 0; i < text.length() / 2; i++) {
            char start = text.charAt(i);
            char end = text.charAt(text.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
