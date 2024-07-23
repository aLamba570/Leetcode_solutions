class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) ->{
            int freq = Integer.compare(map.get(a), map.get(b));
            if(freq!=0){
                return freq;
            }else{
                return Integer.compare(b, a);
            }
        });

        for(int num: nums){
            pq.add(num);
        }


        int j = 0;
        for(int i = 0; i<nums.length; i++){
            nums[j++] = pq.poll();
        }
        return nums;
    }
}