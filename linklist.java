public class linklist {
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

    public static void main(String args[]) {
        linklist list = new linklist();
        list.addFirst("First Node");
        list.addFirst("Second Node");
        list.addLast("Third Node");
        list.printLL(); // Output: Third Node, Second Node, First Node
        // You can add more nodes and implement a method to print the list to verify
    }
}
