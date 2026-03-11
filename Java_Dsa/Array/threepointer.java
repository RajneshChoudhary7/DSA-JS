package Java_Dsa.Array;

public class threepointer {
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        int s=0, e=arr.length-1, m = 0;
        while (m<=e) {
            if(arr[m] == 0){

                int temp = arr[m];
                arr[m] = arr[s];
                arr[s] = temp;
                m++;
                s++;
            }
            else if(arr[m] == 2){
                int temp = arr[m];
                arr[m] = arr[e];
                arr[e] = temp;
                e--;
            }
            else {
                m++;
            }
        }

        for(int i =0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
