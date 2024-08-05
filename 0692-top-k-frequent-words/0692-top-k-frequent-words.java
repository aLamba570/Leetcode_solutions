class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(String str: words){
            map.put(str, map.getOrDefault(str, 0)+1);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
            (a, b)->{
                if(a.getValue().equals(b.getValue())){
                    return a.getKey().compareTo(b.getKey());
                }

                return b.getValue()-a.getValue();
            }
        );

        pq.addAll(map.entrySet());

        for(int i = 0; i<k; i++){
            list.add(pq.poll().getKey());
        }
        return list;

    }
}