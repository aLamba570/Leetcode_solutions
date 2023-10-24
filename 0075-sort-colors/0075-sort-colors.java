class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums, 0 , nums.length-1);
    }

    public void quickSort(int[] nums, int low, int high){
        if(low<high){
            int pidx = partition(nums, low, high);

            quickSort(nums, low, pidx-1);
            quickSort(nums, pidx+1, high);
        }
    }

    public static int partition(int [] nums, int low, int high){
        int pivot = nums[high];
        int i = low -1;

        for(int j = low; j<high; j++){
            if(nums[j] < pivot){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        i++;

        int temp = nums[i];
        nums[i] = nums[high];
        nums[high] = temp;
        return i;
    }
}