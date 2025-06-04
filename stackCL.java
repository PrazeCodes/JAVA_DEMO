import java.util.Stack;
public class stackCL {
    // implimentation using collection framework 

    // push elements at bottom 

    public static void pushAtBottom(int data , Stack<Integer> s) {          
        //base case
        if(s.isEmpty()) {
            s.push(data);
            return;
        } 

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    // reverse a string(using recursion)
    public static void reverse(Stack<Integer> s) {
        // base case
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top , s );
    }
     public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is " + stack.peek());
        reverse(stack);
        System.out.println("Reversed stack is " + stack);
    }
}