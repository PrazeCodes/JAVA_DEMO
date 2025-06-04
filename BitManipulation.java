public class BitManipulation {
    public static void main(String args[]) {
        int n = 5;
        int pos = 2;
        int bitmask = 1 << pos; // Declare bitmask as an int
        // Perform bitwise AND operation between the bitmask and the given number n or set oprtation
        //if ((bitmask & n) == 0) { // Check if the bit at the specified position is 0
        //    System.out.println("Bit at position " + pos + " is 0");
        //} else {
        //   System.out.println("Bit at position " + pos + " is 1");
        //} 
        
        // perform get operation 
        //int newNum = bitmask | n;
        //System.out.println("New number after getting bit at position " + pos + ": " + newNum);
        

        // clear bit ( and with not operation of bitmask );
        int notBitmask = ~bitmask;
        int newNum = n & notBitmask;
        System.out.println("new number after clearing the bit is " + newNum);
    }
}