public class sorting {
    //display
    public static void display(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        int[] Arr = {1,2,3,5,4,8,7};



        //Bubble sort(time complexity = 0(n^2))
        //for(int i=0;i<Arr.length-1;i++) {
          //  for(int j=0;j<Arr.length-i-1;j++) {
            //    if(Arr[j]>Arr[j+1]) {
              //      int temp = Arr[j];
                //    Arr[j] = Arr[j+1];
                  //  Arr[j+1] = temp;
               // }
            //}
        //}
        //System.out.println("Sorted array in ascending order(Bubble sort):");
        //display(Arr);  
        
        
    // selection sort(time complexity:0(n^2))
        //for(int i=0; i<Arr.length-1; i++) {
            //for(int j=i+1; j<Arr.length-1; j++) {
              //  if(Arr[i]>Arr[j]) {
                //    int temp = Arr[i];
                //    Arr[i] = Arr[j];
                //    Arr[j] = temp;
                //}
            //}
        //}
        //System.out.println("\nSorted array in ascending order(Selection sort):");
        //display(Arr);


        // insertion sort
        for(int i=1; i<Arr.length ; i++) {
            int curr = Arr[i];
            int j = i+1;// coounter for sorted part of the array
            while(j>=0 && curr<Arr[j-1]) {
                Arr[j+1]=Arr[j];
                j--;
            }
        Arr[j+1]= curr;
        }
        System.out.println("Sorted Array in ascending order using insertion sort is ");
        display(Arr);
    }
}
