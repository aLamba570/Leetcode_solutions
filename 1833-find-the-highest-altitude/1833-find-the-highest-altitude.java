class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;

        int highest = current;

        for (int i = 0; i < gain.length; i++) {
            int altgain = gain[i];
            current += altgain;
            highest = Math.max(highest, current);
        }

        return highest;
    }
}