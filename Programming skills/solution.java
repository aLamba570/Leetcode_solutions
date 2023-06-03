class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        int len2 = haystack.length();

        if(len==0){
            return 0;
        }

        if(len2>len){
            return -1;
        }

        for(int i =0; i<len-len2;i++){
            int j;
            for (j = 0; j < len2; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }

                if (j == len2) {
                    return i;
                }
        }

        return -1;
    }
}