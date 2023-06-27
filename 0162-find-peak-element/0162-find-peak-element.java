class Solution {
    public int findPeakElement(int[] arr) {
        int start=0,end = arr.length-1;
        int mid = (start+end)/2;

        while(start<end){
             mid = (start+end)/2;

            if(mid<arr.length-1 && arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}