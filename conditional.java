import java.util.*;
public class conditional {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        int age = n.nextInt();
        if(age>=18) {
            System.out.println("adult");
        }
        else{
            System.out.println("not an adult");
        }
        n.close();
    }
}
