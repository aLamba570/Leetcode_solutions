class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] res = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) ->{
                if(a.getValue().equals(b.getValue())){
                    return a.getKey().compareTo(b.getValue());
                }
                return b.getValue() - a.getValue();
            }
        );

        pq.addAll(map.entrySet());
        
        for(int i = 0; i<k; i++){
            // list.add(pq.poll().getKey());
            res[i] = pq.poll().getKey();
        }

        return res;

        
    }
}