public class Recursion2 {
    public static int first = -1;
    public static int last = -1;
    public static boolean map[] = new boolean[26];

    public static void FindOccurence(String str, int idx, int el) {
        // Base case: if idx reaches the length of the string
        if (idx == str.length()) {
            System.out.println("First occurrence is: " + first);
            System.out.println("Last occurrence is: " + last);
            return; // Exit the method
        }

        char c = str.charAt(idx);
        if (c == el) {
            if (first == -1) {
                first = idx; // Set first occurrence
            } else {
                last = idx; // Update last occurrence
            }
        }

        // Recursive call with incremented index
        FindOccurence(str, idx + 1, el);
    }

    public static boolean isSorted(int arr[],int idx) {

        //base case ;
        if(idx==arr.length-1) {
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return isSorted(arr, idx+1);
        }
        else {
            return false;
        }
    }

    public static void moveChar(String str , int idx , int count , String newString , char character) {

        //base case 
        if(idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += character;
            }
            System.out.println(newString);
            return;  //exit the method
        }
        char  c = str.charAt(idx);
        if(c == character) {
            count ++;
            moveChar(str , idx+1 , count , newString , character);
        } else {
            newString +=c;
            moveChar(str , idx+1 , count , newString , character); 
        }
    }

    public static void removeDuplicates(String str , int idx , String newString ) {
        // base case 
        if(idx == str.length()) {
            System.out.println(newString);
            return;  //exit the method
        }
        char c = str.charAt(idx);
        if(map[c - 'a']== true) {
            removeDuplicates(str, idx+1, newString);
        }else {
            map[c-'a']=true;
            newString+=c;
            removeDuplicates(str, idx+1, newString);
        } 
    }

    public static void subsequences(String str , int idx , String newString) {
        // base case 
        if(idx == str.length()) {
            System.out.println(newString);
            return;  //exit the method
        }

        char c = str.charAt(idx);

        //to be 
        subsequences(str , idx+1 , newString+c);

        //not to be 
        subsequences(str, idx+1, newString);
    }

    public static void main(String[] args) {
        String str = "abcd";
        String newString ="";
        subsequences(str, 0, newString);
    }
}

