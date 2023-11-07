class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashSet<Integer> list = new HashSet<>();

        // for(int num : nums){
        //     if(list.contains(num)){
        //         return true;
        //     }
        //     list.add(num);
        // }
        // return false;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}