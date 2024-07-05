class Solution {
    public boolean isValid(String word) {
        String vowels = "aeiouAEIOU";
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        String digits = "0123456789";

        boolean hasVowel = false;
        boolean hasConsonant = false;

        if (word.length() < 3) {
            return false;
        }

        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            
            if (vowels.indexOf(c) != -1) {
                hasVowel = true;
            }

            if (consonants.indexOf(c) != -1) {
                hasConsonant = true;
            }
        }

        return hasVowel && hasConsonant;
    }
}
