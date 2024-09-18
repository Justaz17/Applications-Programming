public class PalindromeFinder {
    public static int findHighestPalindrome() {
        int maxPalindrome = 0;
        int maxProduct = 0;
        for(int i=100; i<=999; i++)
        {
            for(int j=100; j<=999; j++)
            {
                int product = i*j;
                if(isPalindrome(product) && product > maxProduct)
                {
                    maxPalindrome = product;
                    maxProduct = i*j;
                }
            }
        }
        return maxPalindrome;
    }
    private static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        String Rev = new StringBuilder(str).reverse().toString();
        return str.equals(Rev);
    }
}
