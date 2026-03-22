package Java_Dsa.doubledarraymatrix;
public class sumofn {
    public static int sum(int n){
        if (n<2) {
            return n;
        }

        return n=n*sum(n-1);
    }
    public static void main(String[] args) {
        int sums = sum(5);
        System.out.println(sums);
    }
}
