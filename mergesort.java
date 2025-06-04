import java.util.Arrays;

public class mergesort {
    public static void merge(int arr[], int min, int mid, int max) {
        int newArr[] = new int[max - min + 1];

        int idx1 = min, idx2 = mid + 1;
        int idx = 0;

        // Merge two sorted halves into newArr
        while (idx1 <= mid && idx2 <= max) {
            if (arr[idx1] <= arr[idx2]) {
                newArr[idx++] = arr[idx1++];
            } else {
                newArr[idx++] = arr[idx2++];
            }
        }

        // Copy remaining elements from left subarray
        while (idx1 <= mid) {
            newArr[idx++] = arr[idx1++];
        }

        // Copy remaining elements from right subarray
        while (idx2 <= max) {
            newArr[idx++] = arr[idx2++];
        }

        // Copy sorted elements back to the original array
        for (int i = 0; i < newArr.length; i++) {
            arr[min + i] = newArr[i];
        }
    }

    public static void divide(int arr[], int min, int max) {
        if (min >= max) {
            return;
        }

        int mid = min + (max - min) / 2;
        divide(arr, min, mid);
        divide(arr, mid + 1, max);
        merge(arr, min, mid, max);
    }

    public static void main(String args[]) {
        int[] arr = {5, 2, 8, 1, 9}; // Removed extra comma
        System.out.println("Original array: " + Arrays.toString(arr));
        divide(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

