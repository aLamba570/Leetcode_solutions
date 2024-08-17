class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        
        boolean con = true;
        
        for (int i=0; i<k-1; i++) {
            if (nums[i+1] != nums[i] + 1) {
                con = false;
                break;
            }
        }
        
        res[0] = con?nums[k-1]:-1;
        
        for (int i=1; i<=n-k; i++) {
            if (con && nums[i+k-1] == nums[i+k-2] + 1) {
                res[i] = nums[i+k-1];
            } else {
                con = true;
                for (int j=i; j<i+k-1; j++) {
                    if (nums[j+1] != nums[j]+1) {
                        con = false;
                        break;
                    }
                }
                res[i] = con ? nums[i+k-1] : -1;
            }
        }
        return res;
    }
}
