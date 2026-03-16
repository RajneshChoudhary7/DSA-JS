package Java_Dsa.linklist;

public class Node {
    
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }

 

    public void  insert_at_end(int data){
        Node newNode = new Node(data);
        if(this.next == null){
            this.next = newNode;
        }
        else{
            this.next.insert_at_end(data);
        }
    }

    public Node insert_at_start(int data) {

    Node newNode = new Node(data);

    newNode.next = this;

    return newNode;
}
    public void printList(){
        Node temp = this;

        while (temp != null) {
            System.out.println(temp.data +  " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public Node insert_at_position(int data , int pos){
        Node newnNode = new Node(data);

        if(pos == 0 ){
            newnNode.next = this;
            return newnNode;
        }

        Node temp = this;

        for(int i=0 ; i< pos-1 && temp.next !=null; i++){
            temp = temp.next;
        }

        newnNode.next = temp.next;
        temp.next = newnNode;


        return this;
    }

    public Node delete_at_start(){
        return this.next;
    }

    public Node delete_at_end(){
        Node temp = this;

        if(temp.next == null){
            return null;
        }

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return this;
    }


    public Node delete_at_position(int pos){
        if(pos ==0){
            return this.next;
        }

        Node temp = this;

        for(int i=0;i<pos-1 && temp.next!=null;i++){
            temp = temp.next;
        }

        if(temp.next !=null){
            temp.next = temp.next.next;
        }

        return this;
    }

    public int search_element(int element){
        Node temp = this;
        for(int i =0 ; temp != null;i++,temp = temp.next){
            if(temp.data == element){
                System.out.println(element+" is present at "+i+" postion ");
                return i;
            }
        }
        return -1;
    }


    public Node delete_element(int element){

    Node temp = this;

    if(temp.data == element){
        return temp.next;
    }

    while(temp.next != null){

        if(temp.next.data == element){
            temp.next = temp.next.next;
            break;
        }

        temp = temp.next;
    }

    return this;
}    
}
