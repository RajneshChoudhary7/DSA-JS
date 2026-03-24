package Java_Dsa.stack;

import java.util.LinkedList;

public class makeusinglinklist {
    private LinkedList<Integer> list = new LinkedList<>();
    public  void push(int x){
            list.addFirst(x);
        }

        public int pop(){
            if(list.isEmpty()){
                System.out.println("Stack Underflow");
                return -1;
            }
            return list.removeFirst();
        }
        public int peek(){
            if(list.isEmpty()){
                System.out.println("Stack Underflow");
                return -1;
            }
            return list.getFirst();
        }

        public boolean isEmpty(){
            return list.isEmpty();
        }

        public int size(){
            return list.size();
        }
    public static void main(String[] args) {
        makeusinglinklist st = new makeusinglinklist();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top element: " + st.peek()); // 30
        System.out.println("Pop: " + st.pop());          // 30
        System.out.println("Pop: " + st.pop());          // 20
        System.out.println("Is Empty? " + st.isEmpty()); // false
        System.out.println("Pop: " + st.pop());          // 10
        System.out.println("Is Empty? " + st.isEmpty()); // true



        
    }
}
