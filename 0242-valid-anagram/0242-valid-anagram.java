class Solution {
    public boolean isAnagram(String s, String t) {
        // char [] arr1 = s.toCharArray();
        // char [] arr2 = t.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // if(Arrays.equals(arr1, arr2)){
        //     return true;
        // }
        // return false;

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c : s.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) +1);
        }

        for(char c : t.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for(char c : map1.keySet()){
            if(!map2.containsKey(c) || !map2.get(c).equals(map1.get(c))){
                return false;
            }
        }
        return true;
    }
}