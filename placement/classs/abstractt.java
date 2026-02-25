package placement.classs;

abstract class payment {
    abstract void pay(int a);
    void success(){
        System.out.println("Payment done");
    }
    
}

class upiPayment  extends payment{
    void pay(int a){
        System.out.println("pay via Upi "+ a);
    }
}


class Netbanking extends payment{
    void pay(int b){
        System.out.println("pay via netbanking = " +b);
    }
}


public class abstractt {
    public static void main(String[] args) {
        payment obj = new upiPayment();
        obj.pay(25000);
        obj.success();

        payment obj1 = new Netbanking();
        obj1.pay(30000);
        obj1.success();


        
    }
}
