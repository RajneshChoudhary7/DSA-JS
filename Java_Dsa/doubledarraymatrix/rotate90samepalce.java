package Java_Dsa.doubledarraymatrix;

public class rotate90samepalce {
    static void rotateInPlace(int [][]mat){
        //transpose 
        int n = mat.length;
        for(int i=0 ; i<n;i++){
            for(int j=i+1 ; j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // reverse each row
        for(int i=0 ; i<n;i++){
            int l=0 , r = n-1;
            while (l<r) {
                int temp = mat[i][l];
                mat[i][l++] = mat[i][r];
                mat[i][r--] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int [][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotateInPlace(mat);

        for(int i =0 ; i<mat.length;i++){
            for(int j =0 ; j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
