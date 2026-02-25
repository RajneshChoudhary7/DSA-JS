package placement.Java.optimized;

public class zeronstwos {
    
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,2,0,1,2,1,0,2,2,0,1,1,0};
        for(int i =0 ; i<arr.length-1;i++ ){
            for(int j = i ; j<arr.length ; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
        }

        for(int i =0 ; i<arr.length;i++ ){
            System.out.println(arr[i]);
        }
    }
}
