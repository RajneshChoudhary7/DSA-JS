package Java_Dsa.Array;

public class leaders {
    // public static void main(String[] args) {
    //     int[] arr =  {16,17,4,3,5,2};
    //     int[] leader = new int[n];
    //     int flag = -1;
    //     int k  = 0 ;
    //     for(int i = 0 ;i<n-1 ; i++ ){
    //         for(int j = 1 ; j<n ; j++){
    //             if(arr[i]<=arr[j]){
    //                 continue;
    //             }
    //             else{
    //                 flag = 1;
    //             }
                
    //         }
    //         if (flag == 1) {
    //             leader[k] = arr[i];
    //             k++;
    //         }
    //     }
    //     for(int i = 0 ; i<leader.length;i++){
    //         System.out.println(leader[i]);
    //     }

    // }


    public static void main(String[] args) {
        int[] arr =  {16,17,4,3,5,2};
        int k = 0;
        int n = arr.length;
        int[] leader = new int[n];
        int max = arr[n-1];
        leader[k++] = max;
        for(int i = n-2 ; i>=0;i--){
            
            if(arr[i]>max){
                max = arr[i];
                leader[k++] = max;

            }
        }
        for(int i = 0 ; i<k;i++){
            System.out.print(leader[i]+" ");
        }
        
    }
}
