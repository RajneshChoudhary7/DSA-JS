package Java_Dsa.linklist;
import Java_Dsa.linklist.Node;

public class LinkedListExample {
    public static void main(String[] args) {
        // Node  head = new Node(10);
        // head.insert_at_end(20);
        //  head = head.insert_at_start(5);



        // head = head.delete_at_end();
        // head.printList();
        // head.search_element(10);
        // head.delete_element(10);
        // head.printList();


        // System.out.println();
        // System.out.println();
        // int mid = head.midele();
        // System.out.println(mid);

        // list1 = list1.reverse();
        // System.out.println(list1.checkcycle());


        Node list1 = new Node(10);
        list1.insert_at_end(20);
        list1.insert_at_end(30);
        list1.insert_at_end(40);

        
        list1.printList();
        


        System.out.println();


        Node list2 = new Node(5);
        list2.insert_at_end(15);
        list2.insert_at_end(25);
        list2.insert_at_end(35);
        list2.printList();

        Node list3 = Node.mergetosortedll(list1,list2);
        list3.printList();

    }

}

