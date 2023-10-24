class Solution {
    public int[] rearrangeArray(int[] nums) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int num: nums){
            if(num>0){
                list1.add(num);
            }
        }

        for(int num : nums){
            if(num<0){
                list2.add(num);
            }
        }

        ArrayList<Integer> merged = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i<list1.size() && j <list2.size()){
            merged.add(list1.get(i));
            merged.add(list2.get(j));
            i++;
            j++;
        }

        if (i < list1.size()) {
            merged.add(list1.get(i));
            i++;
        }

        if (j < list2.size()) {
            merged.add(list2.get(j));
            j++;
        }


        int[] mergedArray = new int[merged.size()];
        for (int k = 0; k < merged.size(); k++) {
            mergedArray[k] = merged.get(k);
        }
        return mergedArray;
        
    }
}