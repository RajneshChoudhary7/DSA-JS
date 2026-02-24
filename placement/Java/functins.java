package placement.Java;

public class functins {
    static int isPrime(int n){
        int count = -1;
        if(n<=1){
            System.out.println("is not prime number ");
        }
        else if(n==2){
            System.out.println("2 is first prime number");

        }
        else if(n==3){
            System.out.println("3 is second prime number");

        }

        else{
            
            for(int i = 4; i <n ;i++){
                if(n%i==0){
                    count++;
                }
            }
        }
        return count;
    }



    public static void main(String[] args) {
        int count = isPrime(8);
        if(count == -1){
            System.out.println("number is prime ");
        }
        else{
            System.out.println("number is not prime ");
        }
    }
}
