package Java_Dsa.linklist;
import Java_Dsa.linklist.Node;

public class LinkedListExample {
    public static void main(String[] args) {
        Node  head = new Node(10);
        head.insert_at_end(20);
         head = head.insert_at_start(5);
        head = head.insert_at_position(15, 2);


        head = head.delete_at_end();
                head.printList();
                head.search_element(10);

                head.delete_element(10);
                head.printList();
    }
}
