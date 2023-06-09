/*There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).*/

class Solution {
    public int arraySign(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            int x = nums[i];
            if(x==0){
                return 0;
            }

            if(x<0){
                count++;
            }
        }

        return count%2 == 0? 1: -1;    
    }
}