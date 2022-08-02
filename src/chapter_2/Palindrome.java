package chapter_2;

public class Palindrome {
    public static boolean isPalindrome(String text) {
        String s = text.replaceAll("[^0-9a-zA-Z]","");
        return new StringBuilder(s).reverse().toString().equalsIgnoreCase(s);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }
}
