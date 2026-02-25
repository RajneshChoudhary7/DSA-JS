package placement.Java.optimized;

public class sybarray {
    
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {3,-4,5,4,-1,7,-8};

        int maxSum = 0;
        for(int st=0; st<arr.length;st++){
            int currSum = 0;
            for(int end = st ; end<n;end++){
                currSum += arr[end];
                if(maxSum<currSum){
                    maxSum = currSum;
                }
                
            }
            
        }

        System.out.println(maxSum);
    
    }
}


// for(int st=0; st<arr.length;st++){
//             for(int end = st ; end<n;end++){
//                 for(int i = st ; i<=end ; i++){
//                     System.out.print(arr[i]);
//                 }
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }