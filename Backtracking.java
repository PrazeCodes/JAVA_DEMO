public class Backtracking {

    public static void printPermutations(String str , String perm) { // perm string to print all popssible combinations
        
        
        if(perm.length() == str.length()) {
            System.out.println(perm);
            return;  
        }

        for(int i = 0 ; i<str.length() ; i++) {
            char ch = str.charAt(i);
            // make a new string witch doesnot contain the element present in ch 
            String newString = str.substring(0, i) + str.substring(i+1 , str.length());
            //recursive call to get all possible combinations 
            printPermutations(newString, perm+ch);
        }
    }
    public static void main(String args[]) {
        String str = "ABC";
        printPermutations(str, "");
    }
}