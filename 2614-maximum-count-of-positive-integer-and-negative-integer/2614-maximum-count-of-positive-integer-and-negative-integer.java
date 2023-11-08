class Solution {
    public int maximumCount(int[] nums) {
        int maxPos = 0;  
        int maxNeg = 0; 
        int pos = 0;
        int neg = 0;

        for (int num : nums) {
            if (num > 0) {
                pos++;
                neg = 0; 
                maxPos = Math.max(maxPos, pos);
            } else if (num < 0) {
                neg++;
                pos = 0;  
                maxNeg = Math.max(maxNeg, neg);
            } else {
                pos = 0;
                neg = 0;
            }
        }

        return Math.max(maxPos, maxNeg);
    }
}
