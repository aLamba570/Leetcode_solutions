class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");
        ArrayList<String> res = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        for(String str: arr1){
            map.put(str, map.getOrDefault(str, 0)+1);
        }

        for(String str: arr2){
            map.put(str, map.getOrDefault(str, 0)+1);
        }

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                res.add(entry.getKey());
            }
        }

        return res.toArray(new String[0]);
        
    }
}