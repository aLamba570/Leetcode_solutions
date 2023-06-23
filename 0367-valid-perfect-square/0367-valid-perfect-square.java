class Solution {
    public boolean isPerfectSquare(int num) {
        double result = Math.sqrt(num);

        boolean isInteger = (Math.floor(result) == Math.ceil(result));

        if(isInteger){
            return true;
        }
        return false;
    }
}