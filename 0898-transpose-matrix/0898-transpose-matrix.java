class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[m-1].length;
        int res[][] = new int[n][m];
       for(int i=0; i<m; i++){
        for(int j = 0; j<n; j++){
            res[j][i] = matrix[i][j];
        }
       }
       return res;
    }
}