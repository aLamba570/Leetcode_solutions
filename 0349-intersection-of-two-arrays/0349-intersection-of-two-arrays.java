class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        Set<Integer> commonElements = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            if (set1.contains(arr2[i])) {
                commonElements.add(arr2[i]);
            }
        }

        int[] result = new int[commonElements.size()];
        int index = 0;
        Iterator<Integer> iterator = commonElements.iterator();
        while (iterator.hasNext()) {
            result[index] = iterator.next();
            index++;
        }
        return result;
    }
}
