import java.util.*;

public class Array {
    public static void input(int array[], int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
    }

    public static int findNumber(int[] array, int size, int num) {
        for (int i = 0; i < size; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        input(array, size);
        System.out.println("Enter the number to search for:");
        int num = sc.nextInt();
        int idx = findNumber(array, size, num);
        System.out.println("The index of the number is: " + idx);
        sc.close();
    }
}