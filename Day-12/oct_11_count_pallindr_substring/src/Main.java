public class Main {
    public static void main(String[] args) {
        String s = "madammadam";
        int count = countPalindromicSubstrings(s);
        System.out.println("Number of palindromic substrings: " + count);
        System.out.println(f(16));
    }
    public static int f(int n){
        if(n<=2){
            return n;
        }
        return f(n-4)+f(n-2);
    }

    public static int countPalindromicSubstrings(String s) {
        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];
        int count = 0;

        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
            count++;
        }

        // Check for palindromes of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
                count++;
            }
        }

        // Check for palindromes of length 3 or more
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && isPalindrome[i + 1][j - 1]) {
                    isPalindrome[i][j] = true;
                    count++;
                }
            }
        }

        return count;
    }
}
