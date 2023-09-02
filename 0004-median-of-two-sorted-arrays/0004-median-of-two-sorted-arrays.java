class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while (i < m) {
            merged[k++] = nums1[i++];
        }

        while (j < n) {
            merged[k++] = nums2[j++];
        }

        int length = merged.length;

        if (length % 2 == 0) {
            int mid1 = merged[length / 2 - 1];
            int mid2 = merged[length / 2];
            return (double) (mid1 + mid2) / 2;
        } else {
            return (double) merged[length / 2];
        }
    }

}