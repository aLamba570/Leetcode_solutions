class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
    int m = nums1.length;
    int n = nums2.length;

    

    int z = m+n;

    int [] merged = new int[z];
    int i = 0, j = 0, k=0;

    while(i<m && j<n){
        if(nums1[i]<nums2[j]){
            merged[k]=nums1[i];
            k++;
            i++;
        }
        else{
            merged[k]=nums2[j];
            k++;
            j++;
        }
    }

    while(i<m){
        merged[k]=nums1[i];
        k++;
        i++;
    }

    while(j<n){
        merged[k]= nums2[j];
        k++;
        j++;
    }

    if(z%2==0){
        int mid1 = merged[z/2-1];
        int mid2 = merged[z/2];
        return (double) (mid1+mid2)/2;
    }
    else{
        return (double) merged[z/2];
    }

    // ArrayList<Integer> list1 = new ArrayList<>();
    // ArrayList<Integer> list2 = new ArrayList<>();

    // for(int num: nums1){
    //     list1.add(num);
    // }
    // for(int num: nums2){
    //     list2.add(num);
    // }

    // list1.addAll(list2);

    // Collections.sort(list1);

    // int p = list1.size();

    //     if (p % 2 == 0) {
    //         int mid1 = list1.get(p / 2 - 1);
    //         int mid2 = list1.get(p / 2);
    //         return (double) (mid1 + mid2) / 2;
    //     } else {
    //         return (double) list1.get(p / 2);
    //     }
    }
}