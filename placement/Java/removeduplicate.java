package placement.Java;

public class removeduplicate {
    public static void main(String[] args) {
        String s1  = new String("nitin");
        String s2  = new String("");

        for(int i  =0 ; i<s1.length()-1;i++){
            char ch = s1.charAt(i);
            
            if(s2.indexOf(ch) == -1){
                s2 += ch;
            }
        }
        System.out.println(s2);

    }
    
}
