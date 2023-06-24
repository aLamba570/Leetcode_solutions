class Solution {
    public boolean isPalindrome(int x) {
        int orignal = x;
        int rev = 0;
        while(x>0){
            rev = x%10 + rev*10;
            x = x/10;
        }
        if(rev == orignal){
            return true;
        }
        return false;
    }
}