class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // int maxIndex = 0;
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] > nums[maxIndex]) {
        //         maxIndex = i;
        //     }
        // }
        // return maxIndex;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}