package Java_Dsa.doubledarraymatrix;

public class AntiClockwise {
    static void rotateAntiClockwise(int[][] mat){
        int n= mat.length;

        for(int i=0 ;i<n;i++){
            for(int j =i ; j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int j = 0; j<n ; j++){
            int t =0 , b= n-1;
            while (t<b) {
                int temp = mat[t][j];
                mat[t++][j] = mat[b][j];
                mat[b--][j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int [][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotateAntiClockwise(mat);

        for(int i =0 ; i<mat.length;i++){
            for(int j =0 ; j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
