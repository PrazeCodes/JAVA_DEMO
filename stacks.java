public class stacks {

    // Node class should be static so it can be used without an instance of Stacks
    public static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public class StackLL {
        private Node head; // Make head an instance variable

        public void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode; // Push the element on top of the stack
            }
        }

        public int pop() {
            if (head == null) {
                return -1; // Stack is empty
            }
            int top = head.data;
            head = head.next; // Move head to the next node
            return top;
        }

        public int peek() {
            if (head == null) {
                return -1; // Stack is empty
            }
            return head.data; // Return the top element
        }
    }

    public static void main(String[] args) {
        stacks Stacks = new stacks(); // Create an instance of Stacks
        StackLL stack = Stacks.new StackLL(); // Create an instance of StackLL

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek at the top element
        System.out.println("Top element is: " + stack.peek()); // Should print 30

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop()); // Should print 30
        System.out.println("Popped element: " + stack.pop()); // Should print 20

        // Peek again
        System.out.println("Top element is: " + stack.peek()); // Should print 10

        // Pop the last element
        System.out.println("Popped element: " + stack.pop()); // Should print 10

        // Try to pop from an empty stack
        System.out.println("Popped element: " + stack.pop()); // Should print -1 (indicating stack is empty)

        // Peek at the empty stack
        System.out.println("Top element is: " + stack.peek()); // Should print -1 (indicating stack is empty)
    }
}
