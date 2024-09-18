public class Main {
    public static void main(String[] args) {
        PalindromeFinder pf = new PalindromeFinder();

        int highestPalindrome = pf.findHighestPalindrome();

        System.out.println("The highest Palindrome for 3 digits is: " + highestPalindrome);
    }
}