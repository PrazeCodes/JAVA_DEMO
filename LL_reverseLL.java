public class LL_reverseLL {
    private Node head;
    public class Node {
        String data;
        Node next;

        Node(String data) { // constructor
            this.data = data;
            this.next = null;
            
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void printLL () {
        Node curr = head; // iterator node
        while(curr != null) {
            System.out.println(curr.data + "->");
            curr = curr.next;
        }
    }
        
    public void deleteFirst() {
        if(head == null) {
            return;
        }
        
        head = head.next;

    }
    
    public void deleteLast() {
        if(head == null) {
            return;
        }
        if(head.next == null) {
             
            head = null;
            return;
        }
        Node curr = head;
        while(curr.next.next != null) {
            curr = curr.next;
        }
        
        curr.next = null;
    }

    public void reverse () {     // iterative approach to rverse a linked list
        //corner case;
        if(head == null || head.next == null) {
            return; // no need to reverse
        }
        Node prev = head;
        Node curr =  head.next;
        while(curr!=null) {
            Node next = curr.next;
            curr.next = prev;
            //update;
            prev = curr;
            curr = next;
        }
        head.next =  null;
        head = prev; //make last node as head
    }

    public static void main(String args[]) {
        LL_reverseLL list = new LL_reverseLL();
        list.addFirst("First Node");
        list.addFirst("Second Node");
        list.addLast("Third Node");
        list.printLL(); // Output: Third Node, Second Node, First Node
        // You can add more nodes and implement a method to print the list to verify
    }
}
