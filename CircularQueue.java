public class CircularQueue {
    class Queue {
        private int arr[];
        private int size;
        private int rear;
        private int front;

        // Constructor
        public Queue(int size) {
            arr = new int[size];
            this.size = size;
            this.rear = -1; // Initially, the queue is empty
            this.front = 0;
        }

        // Method to add an element to the queue
        public void enqueue(int value) {
            if (isFull()) {
                System.out.println("Queue is full. Cannot enqueue " + value);
                return;
            }
            // If the queue is empty, set rear to 0
            if (isEmpty()) {
                rear = 0;
            } else {
                rear = (rear + 1) % size; // Circular increment
            }
            arr[rear] = value;
            System.out.println("Enqueued: " + value);
        }

        // Method to remove an element from the queue
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return -1; // Indicating that the queue is empty
            }
            int value = arr[front];
            // If the queue becomes empty after this dequeue, reset front and rear
            if (front == rear) {
                front = 0;
                rear = -1; // Reset the queue
            } else {
                front = (front + 1) % size; // Circular increment
            }
            return value;
        }

        // Method to check if the queue is empty
        public boolean isEmpty() {
            return rear == -1; // Queue is empty if rear is -1
        }

        // Method to check if the queue is full
        public boolean isFull() {
            return (rear + 1) % size == front; // Check if next position of rear is front
        }

        // Method to get the front element of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot peek.");
                return -1; // Indicating that the queue is empty
            }
            return arr[front];
        }

        // Method to display the elements of the queue
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }
            System.out.print("Queue elements: ");
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break; // Stop when we reach the rear
                i = (i + 1) % size; // Circular increment
            }
            System.out.println();
        }

        // Main method to test the queue implementation
        public static void main(String[] args) {
            CircularQueue y = new CircularQueue();
            Queue queue = y.new Queue(5);
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.display();
            
            System.out.println("Dequeued: " + queue.dequeue());
            queue.display();
            
            queue.enqueue(40);
            queue.enqueue(50);
            queue.enqueue(60); // This should show that the queue is full
            queue.display();
            
            System.out.println("Front element: " + queue.peek());
        }
    }
}