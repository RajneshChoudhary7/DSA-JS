package Java_Dsa.doubledarraymatrix;

public class rotate90 {
    static int[][] rotate900(int[][] mat){
        int n=mat.length;
        int[][] result = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0 ; j<n; j++){
                result[j][n-1-i] = mat[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int [][] got = rotate900(mat);

        for(int i =0 ; i<got.length;i++){
            for(int j =0 ; j<got[0].length;j++){
                System.out.print(got[i][j]+" ");
            }
            System.out.println();
        }
    }
}
