class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        for (String str : words1) {
            map1.put(str, map1.getOrDefault(str, 0) + 1);
        }

        for (String str : words2) {
            map2.put(str, map2.getOrDefault(str, 0) + 1);
        }


        for(Map.Entry<String, Integer> entry : map1.entrySet()){
            if(entry.getValue() == 1){
                set1.add(entry.getKey());
            }
        }

        for(Map.Entry<String, Integer> entry : map2.entrySet()){
            if(entry.getValue() == 1){
                set2.add(entry.getKey());
            }
        }
        System.out.println(set1);
        System.out.println(set2);

        set1.retainAll(set2);

        return set1.size();


    }
}