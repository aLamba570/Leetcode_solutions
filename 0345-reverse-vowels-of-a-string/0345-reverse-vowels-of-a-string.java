class Solution {
    public String reverseVowels(String st) {
        char str[] = st.toCharArray();
        String vowel = "aeiouAEIOU";
        int s = 0;
        int e = st.length() - 1;

        while (s < e) {
            while (s < e && vowel.indexOf(str[s]) == -1) {
                s++;
            }

            while (s < e && vowel.indexOf(str[e]) == -1) {
                e--;
            }

            if (s < e) {
                char temp = str[s];
                str[s] = str[e];
                str[e] = temp;
                s++;
                e--;
            }
        }
        return new String(str);
    }
}
