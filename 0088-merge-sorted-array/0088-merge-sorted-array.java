
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergedList.add(nums1[i]);
                i++;
            } else {
                mergedList.add(nums2[j]);
                j++;
            }
        }
        
        while (i < m) {
            mergedList.add(nums1[i]);
            i++;
        }
        
        while (j < n) {
            mergedList.add(nums2[j]);
            j++;
        }
        
        for (int k = 0; k < mergedList.size(); k++) {
            nums1[k] = mergedList.get(k);
        }
    }
}
