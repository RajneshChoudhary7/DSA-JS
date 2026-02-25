// package placement.Java.optimized;

// public class UnionIntersection  {

//     public static boolean isPresent(int[] arr, int size , int key){
//         for(int i = 0; i<size;i++){
//             if(arr[i] == key)
//                 return true;
//         }
//         return false;
//     }

//     public static int[] union(int[] arr1 , int[] arr2){
//         int n1 = arr1.length;
//         int n2 = arr2.length;

//         int [] result = new int[n1+n2];
//         int k =0;

//         for(int i=0; i<n1 ; i++){
//             result[k++] = arr1[i];
//         }


//         for(int i=0; i<n2;i++){
//             if(!isPresent(arr2[i], result, k)){
//                 result[k++] = arr2[i];
//             }
//         }
//     }





















    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6};

        int[] unionArray = union(arr1 , arr2);

        for(int num : unionArray){
            System.out.println(num+" ");
        }
    }
}
