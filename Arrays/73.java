// LeetCode 73 - Set Matrix Zeroes
// Difficulty: Medium
// Approach: In-place Marking
class Solution {
    public void setZeroes(int[][] matrix) {
 
        /*

        int m = matrix.length;
        int n = matrix[0].length;
        for(int  i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    markRow(matrix, i);
                    markCol(matrix, j);
                }
            }
        }
        for(int  i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == -1){
                  matrix[i][j] = 0;  
                }
            }
        }
    }

        private void markRow(int[][] matrix, int i){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] != 0){
                    matrix[i][j] = -1;
                }
            }
        }

        private void markCol(int[][] matrix, int j){
            for(int i = 0; i < matrix.length; i++){
                if(matrix[i][j] != 0){
                    matrix[i][j] = -1;
                }
            }
            */

            int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Step 1
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) firstRowZero = true;
        }

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) firstColZero = true;
        }

        // Step 2
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 3
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 4
        if (firstRowZero) {
            for (int j = 0; j < n; j++) matrix[0][j] = 0;
        }

        if (firstColZero) {
            for (int i = 0; i < m; i++) matrix[i][0] = 0;
        }
        }

     
} 

