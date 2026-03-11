package Java_Dsa.Array;

public class evenpostiveshift {
    public static void main(String[] args) {
        int [] arr = {-1,2,5,-8,6,4,-89,-75,55};
        int n = arr.length;
        int r =0 ,  temp = 0;
        for(int l =0 ; l<=arr.length-1;l++){
            if(arr[l]>0 && arr[l]%2==0){
                temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                r++;
            }
        }
        for(int k = 0 ;k<n;k++){
            System.out.print(arr[k]+"  ");
        }
    }
}
