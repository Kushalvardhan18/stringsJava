public class PalindromeString {

    public static boolean isPalindrome(String str) {
        // Convert the input string to lowercase to make the palindrome check case-insensitive
        str = str.toLowerCase();

        StringBuilder sb = new StringBuilder();

        // Append characters in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        // Convert StringBuilder to String
        String reversedStr = sb.toString();

        // Check if the reversed string is equal to the original string
        return reversedStr.equals(str);
    }

    public static void main(String[] args) {
        String str = "Kushal";
        System.out.println(isPalindrome(str));  // Output: false

        String palindromeStr = "radar";
        System.out.println(isPalindrome(palindromeStr));  // Output: true
    }
}
