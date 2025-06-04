import java.util.*;
public class QueueCL {
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        
        // Queue in java collection framework is a interfae , not a class. we know that interfaces cant have methods;

        Queue<Integer>qe = new ArrayDeque<>();;
        qe.add(10);
        qe.add(20);
        System.out.println("Queue: " + q);
        System.out.println("Size of queue: " + qe.size());
        System.out.println("Peek element: " + qe.peek());
        System.out.println("Dequeued element: " + qe.poll()); //.poll() to dequeue element 
        System.out.println("Queue: " + qe);

        // Trying to dequeue from an empty queue
        try {
            System.out.println("Dequeued element: " + qe.poll());
        } catch (NoSuchElementException e) {
            System.out.println("Queue is empty");
        }
    }
}
