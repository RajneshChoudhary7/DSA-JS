package placement.classs;

class Calculate{
    int num1;
    int num2;
    public Calculate(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add(){
        
        int result = num1+num2;
        System.out.println( "addition is = "+result );
        return result ;
    }
    public int sub(){
        int result = num1-num2;
        System.out.println( "subtraction is = "+result );
        return result ;
    }
    public int div(){
        int result = num1/num2;
        System.out.println( "division is = "+result );
        return result ;
    }
    public int mul(){
        int result = num1*num2;
        System.out.println( "multiplication is = "+result );
        return result ;
    }
}

public class calculator {
    public static void main(String[] args) {
        Calculate o1 = new Calculate(23,45);
        o1.add();
        o1.sub();
        o1.mul();
        o1.div();
    }
}
