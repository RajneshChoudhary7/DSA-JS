package Java_Dsa.doublylinklist;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}


public class doublyll {
    // Print DLL
    public static void printDLL(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Convert Array to DLL
    public static Node convertArr2Dll(int[] arr){

        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i = 1; i < arr.length; i++){

            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    public static void deletefirst(Node head){
        Node temp = head;
        

    }

    public static void main(String[] args) {

        int[] arr = {12, 3, 4, 6};

        Node head = convertArr2Dll(arr);

        printDLL(head);
    }
}

