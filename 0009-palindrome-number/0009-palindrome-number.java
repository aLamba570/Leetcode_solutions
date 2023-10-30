class Solution {
    public boolean isPalindrome(int x) {


        //less optimized way


        // String str = Integer.toString(x);

        // String rev = "";

        // for (int i = str.length() - 1; i >= 0; i--) {
        //     rev += str.charAt(i);
        // }


        // return str.equals(rev);


        //more optimized

        if(x<0){
            return false;
        }

        int orignal = x;
        int rev = 0;

        while(x!=0){
            int digit = x%10;
            rev = rev*10 + digit;
            x = x/10;
        }
        
        return orignal == rev;
    }
}