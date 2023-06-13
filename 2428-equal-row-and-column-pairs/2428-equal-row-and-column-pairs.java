class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                boolean check = true;

                for(int k =0; k<n; k++){
                    if(grid[i][k] != grid[k][j]){
                        check = false;
                        break;
                    }
                }

                count += check ? 1:0;
            }
        }
        return count;
    }
}