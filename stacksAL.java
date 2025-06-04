import java.util.ArrayList;

public class stacksAL {

    static class stack {  // ✅ Made it static
        static ArrayList<Integer> st = new ArrayList<Integer>();

        public static boolean isEmpty() {
            return st.size() == 0;
        }

        public static void push(int data) {
            st.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return st.remove(st.size() - 1);
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return st.get(st.size() - 1);
        }
    }

    public static void main(String[] args) {  // ✅ No extra bracket issues
        stacksAL.stack s = new stacksAL.stack();  // ✅ Correct object creation
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top element is " + s.peek());
    }
}

