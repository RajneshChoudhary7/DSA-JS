package Java_Dsa.doubledarraymatrix;

public class digonalsum {
    static int digonalSum(int [][] mat){
        int sum =0;
        int n = mat.length;
        System.out.println(n);
        for(int i=0; i<n;i++){
            sum +=mat[i][i];
            sum +=mat[i][n-1-i];
        }

        if(n%2 !=0){
            sum -=mat[n/2][n/2];
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int [][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sum  = digonalSum(mat);
        System.out.println(sum);
    }
}
