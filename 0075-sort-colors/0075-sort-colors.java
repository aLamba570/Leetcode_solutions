class Solution {
    public void sortColors(int[] nums) {

        // Selection sort
        // for ( int i = 0; i<nums.length-1; i++){
        //     int minIndex = i;
        //     for(int j = i+1; j<nums.length; j++){
        //         if(nums[j] < nums[minIndex]){
        //             minIndex = j;
        //         }
        //     }

        //     int temp = nums[minIndex];
        //     nums[minIndex] = nums[i];
        //     nums[i] = temp;
        // }



        // inbuilt
        // Arrays.sort(nums);


        boolean swapped;

        for(int i = 0; i<nums.length-1; i++){
            swapped = false;
            for(int j = 0; j<nums.length-i-1; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
}