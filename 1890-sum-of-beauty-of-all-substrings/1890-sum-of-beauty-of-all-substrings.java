class Solution {
    public int beautySum(String s) {
        int beauty = 0;
        int n = s.length();

        int r = 0;
        while (r < n) {
            HashMap<Character, Integer> map = new HashMap<>();
            int l = r;
            while (l < n) {
                char c = s.charAt(l);
                map.put(c, map.getOrDefault(c, 0) + 1);

                int min = getMin(map);
                int max = getMax(map);

                int ans = max - min;
                beauty += ans;

                l++;
            }
            r++;
        }
        return beauty;
    }

    public static int getMax(HashMap<Character, Integer> map) {
        int max = Integer.MIN_VALUE;
        for (int count : map.values()) {
            max = Math.max(max, count);
        }
        return max;
    }

    public static int getMin(HashMap<Character, Integer> map) {
        int min = Integer.MAX_VALUE;
        for (int count : map.values()) {
            if (count != 0) {
                min = Math.min(min, count);
            }
        }
        return min;
    }
}
