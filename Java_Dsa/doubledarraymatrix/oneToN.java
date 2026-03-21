package Java_Dsa.doubledarraymatrix;

public class oneToN {
    public static void printt(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printt(i+1, n);
    }
    public static void printrev(int i ,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        printrev(i-1, n);
    }
    public static void main(String[] args) {
        printt(1,5); 
        printrev(5, 5);
    }
}
