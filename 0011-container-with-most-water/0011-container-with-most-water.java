class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int area = 0;
        int left = 0;

        int right = height.length-1;
        // for(int i = 0; i<height.length; i++){
        //     for(int j = i+1; j<height.length; j++){
        //         area = (j-i) * Math.min(height[i], height[j]);
        //         result = Math.max(result, area);
        //     }
        // }
        // return result;

        while(left<right){
            area = (right - left) * Math.min(height[left], height[right]); //jiski height kam hogi dono ke comaprison me use hi multiplication me use karenge
            result = Math.max(result, area);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }
}