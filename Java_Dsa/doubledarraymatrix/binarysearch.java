package Java_Dsa.doubledarraymatrix;

import java.util.Scanner;



public class binarysearch {

    public static boolean searchMatrix(int[][] mat , int target){
        int n=mat.length;
        int m=mat[0].length;

        int low =0;
        int high = n*m-1;

        while (low<= high) {
            int mid = (low+high) /2;
            int row = mid/m;
            int col = mid%m;

            if(mat[row][col] == target){
                return true;
            } else if(mat[row][col] < target){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row ans cols = ");
        int row  = sc.nextInt();
        int cols  = sc.nextInt();

        
        int [][] numbers = new int[row][cols];

        System.out.println("enter the numbers in array ");
        for(int i=0 ; i<row ;i++){
            for(int j=0 ;j<cols;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i=0 ; i<row ;i++){
            for(int j=0 ;j<cols;j++){
                System.out.print(numbers[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("enter the number which you want to search ");
        int element  = sc.nextInt();

        System.out.println(searchMatrix(numbers,element));
    }
}
