import java.util.LinkedList;
public class LL_collecctionFramework {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();

        // .add(element)
        list.addFirst(10);
        list.addFirst(11);  // .addFirst (element) is used to add element at first position
        list.addLast(12);   // .addLast(element) is used to add element in the last
        System.out.println("Original list: " + list);
        
        //   .size() is used to get the size of the linkedlist
        System.out.println("the size of the linklist is:" + list.size()); 
        
        
        //   .get(index) is used to get the elements of the linked list at the index

        for(int i=0 ; i<list.size() ; i++) {
            System.out.println("Element at index " + i + " is: " + list.get(i));
        }

        //   .remove(index) is used to remove element from the linked list at the index
        list.remove(0);  //.remove(index) is used to remove element from the linked list at the index
        System.out.println("After removing first element: " + list);
    }
}
