package Java_Dsa.Array;

public class highAltitude {
    public static void main(String[] args) {
        int [] arr = {-5,1,5,0,-7};
    int max = Integer.MAX_VALUE ;
    int sum = 0;
    for(int i =0 ; i<arr.length;i++){
        sum += arr[i];
        if(max<sum){
            max=sum;
        }
    }
    }
    

}
