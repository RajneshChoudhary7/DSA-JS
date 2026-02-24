package placement.Java;

public class stringpalandrom {
    
   public static void main(String[] args) {

     String s1 = new String("nitin");
     String s3 = new String("");
        String s2 = new String("");

    for(int i = s1.length()-1 ;i>=0;i--){
        
        s2 += s1.charAt(i);
    }

    if(s1.equals(s2)){
        System.out.println("String is palandrom");
    }
    else{
        System.out.println("String is not palandrom");
    }
    



   }
}
