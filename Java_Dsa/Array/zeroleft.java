package Java_Dsa.Array;

public class zeroleft {
    public static void main(String[] args) {
        int [] arr = {1,0,2,7,0,0,4,5};
        int n = arr.length;
        int r =arr.length-1 ,  temp = 0;
        for(int l =arr.length-1 ; l>=0;l--){
            if(arr[l]!=0){
                temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                r--;
            }
        }
        for(int k = 0 ;k<n;k++){
            System.out.print(arr[k]);
        }
    }
}
