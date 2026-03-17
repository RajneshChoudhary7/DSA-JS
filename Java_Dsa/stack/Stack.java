package Java_Dsa.stack;

import java.util.ArrayList;

public class Stack {

    ArrayList<Integer> stack = new ArrayList<>();
    int push(int data){
        stack.add(data);
        return data;
    }

    public int pop(){
        if(stack.isEmpty()){
            System.out.println("Stack is empay");
            return -1;
        }
        return stack.remove(stack.size()-1);
    }
    int peak(){
        if(stack.isEmpty()){
            System.out.println("Stack is empay");
            return -1;
        }
        return stack.get(stack.size()-1);
    }

    int size(){
        
        return stack.size();
    }

    boolean isEmpty(){
        
        return stack.isEmpty();
    }

    public void printStack(){
        for(int i =stack.size()-1;  i>=0 ; i--){
            System.out.println("|"+stack.get(i)+"|");
            
        }
        System.out.println("|__|");
    }

    public static void main(String[] args) {
        Stack obj = new Stack();

        obj.push(10);
        obj.push(20);
        obj.push(30);

        System.out.println("Top: " + obj.peak()); 
        System.out.println("Pop: " + obj.pop());  
        System.out.println("Size: " + obj.size()); 
        obj.printStack();
    }
}
