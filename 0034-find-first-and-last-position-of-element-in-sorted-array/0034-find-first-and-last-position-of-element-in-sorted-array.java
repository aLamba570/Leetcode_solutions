class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int first = -1;
        // int last = -1;

        // for(int i =0; i<nums.length; i++){
        //     if(nums[i]==target){
        //         if(first == -1){
        //             first =i;
        //         }
        //         last = i;
        //     }
        //     else if(nums[i]> target){
        //         break;
        //     }
        // }
        // return new int[] {first, last};

       int first = firstOccurence(nums, target);
       int last = lastOccurance(nums, target);;

       if(first == -1){
           return new int [] {-1, -1};
       }

       return new int [] {first, last};
    }

    private int firstOccurence(int [] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int first = -1;

        while(left <= right){
            int mid = (left+right)/2;

            if(nums[mid] == target){
                first = mid;
                right = mid -1;
            }
            else if(nums[mid] < target){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
        return first;
    }

    private int lastOccurance(int [] nums, int target){
        int last = -1;
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid] == target){
                last = mid;
                left = mid + 1;
            }

            else if(nums[mid]<target){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
        return last;
    }
}