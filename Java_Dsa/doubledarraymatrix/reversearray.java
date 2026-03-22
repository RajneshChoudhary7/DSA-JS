package Java_Dsa.doubledarraymatrix;

public class reversearray {
    public static int swap(int[] arr, int l , int r){
        if(l>=r){
            return arr;
        }
        swap(arr, l+1, r-1);
    }
    public static void main(String[] args) {
        
    }
}
