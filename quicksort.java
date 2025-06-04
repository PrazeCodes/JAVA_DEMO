public class quicksort {

    public static int partition (int arr[] , int low , int high) {
        int pivot = arr[high];;
        int i = low -1 ;
        for(int j =low ; j<high ; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];;
                arr[i] = arr [j];
                arr[j] = temp;
            }
        }
        // to find the index of next pivot 
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp ;
        return i ;
    }

    public static void quickSort (int arr[] , int low , int high) {

        if(low < high ) {
            int pidx = partition(arr , low , high );
            quickSort(arr , low , pidx-1);
            quickSort(arr , pidx+1 , high);
        }
    }
    public static void main(String args[]) {
        int arr[] = {2 , 4 , 1 , 6, 3 , 10};

        quickSort(arr , 0 , arr.length-1);
        //displaying the sorted array 
        System.out.println("Sorted array in ascending order");
        for(int i = 0 ; i < arr.length ; i++)
            System.out.print(arr[i] + " ");
    }
}