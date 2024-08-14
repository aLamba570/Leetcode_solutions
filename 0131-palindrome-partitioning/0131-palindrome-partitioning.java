class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        int n = s.length();
        int total = 1 << (n - 1);

        for (int i = 0; i < total; i++) {
            List<String> list = new ArrayList<>();
            int l = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    list.add(s.substring(l, j + 1));
                    l = j + 1;  // Move the start index to j + 1 only if a partition is made
                }
            }

            
            list.add(s.substring(l));

            if (isAllPalindrome(list)) {
                result.add(list);
            }
        }
        return result;
    }

    private boolean isAllPalindrome(List<String> list) {
        for (String part : list) {
            if (!isPalindrome(part)) {
                return false;
            }
        }
        return true;
    }

    private boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
