import java.util.*;
public class function {
    public static void printName(String name) {
        System.out.println("The name is:" + name);
        return;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        printName(name);
        scanner.close();
    }
}
