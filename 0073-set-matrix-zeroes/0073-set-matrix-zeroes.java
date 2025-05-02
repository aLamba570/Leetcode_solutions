class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == 0){
                    setRow(matrix, i);
                    setCol(matrix, j);
                }
            }
        }

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == 999){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void setRow(int[][] matrix, int i){
        int m = matrix.length;
        int n = matrix[0].length;

        for(int j = 0; j<n; j++){
            if(matrix[i][j] !=0){
                matrix[i][j] = 999;
            }
        }
    }

    public static void setCol(int[][] matrix, int j){
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i<m; i++){
            if(matrix[i][j] !=0){
                matrix[i][j] = 999;
            }
        }
    }
}