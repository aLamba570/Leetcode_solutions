class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxCount = 0; // Initialize the maximum count of ones
        int rowIndex = 0; // Initialize the row index with -1 (invalid index)

        for (int i = 0; i < mat.length; i++) {
            int count = 0; 
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                rowIndex = i; 
            }
        }

        int[] result = { rowIndex, maxCount };
        return result;
    }
}
