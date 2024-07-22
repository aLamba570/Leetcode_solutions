class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());

        for(int i = 0; i<n; i++){
            map.put(heights[i], names[i]);
        }

        int index = 0;
        for(String name: map.values()){
            names[index] = name;
            index++;
        }
        return names;
    }
}