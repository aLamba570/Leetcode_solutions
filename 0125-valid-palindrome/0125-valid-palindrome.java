class Solution {
    public boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String rev = "";

        // Build the reverse string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Compare the original string and its reverse
        return str.equals(rev);
    }
}
