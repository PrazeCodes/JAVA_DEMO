public class queueLL {
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        private Node head = null;
        private Node tail = null;

        public boolean isEmpty() {
            return head == null; // Only need to check head
        }

        // Enqueue
        public void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1; // Indicating that the queue is empty
            }
            int front = head.data;
            head = head.next;
            if (head == null) { // If the queue becomes empty
                tail = null; // Reset tail
            }
            return front;
        }

        // Peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1; // Indicating that the queue is empty
            }
            return head.data;
        }

        // Display
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            while (temp != null) { // Loop until temp is null
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null"); // Indicate the end of the queue
        }
    }

    public static void main(String[] args) {
        queueLL qll = new queueLL();
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.display();
        System.out.println("Front element is " + q.peek());
        System.out.println("Dequeued: " + q.remove());
        q.display();
    }
}
