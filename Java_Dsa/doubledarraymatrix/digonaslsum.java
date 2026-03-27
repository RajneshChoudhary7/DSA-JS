package Java_Dsa.doubledarraymatrix;

public class digonaslsum {
    class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int primarySum = 0;
        int secondrySum = 0;
        for(int i =0 ; i<n ; i++){
            primarySum += mat[i][i];
            secondrySum += mat[i][n- i -1];
        }
        int total = primarySum +secondrySum;
        if(n%2 == 1){
            total -= mat[n/2][n/2];
        }
        return total ;
    }
}
}
