package scratches;

public class BubbleSort {

    public  static void bSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) {

                if (arr[j-1] > arr[j ]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


//     public void printArray(int arr[]) {
//         int n = arr.length;
//         for (int i = 0; i < n; ++i) {
//             System.out.println(arr[i] + " ");
//             System.out.println();
//         }


         public static void main (String args[])

         {

             BubbleSort ob = new BubbleSort();
             int arr[] = {5, 1, 4, 2, 7};

             System.out.println("Array before sorting");

             for( int i =0; i < arr.length; i++){
                 System.out.println(arr[i]+ " ");
             }
              ob.bSort(arr);
             System.out.println("Sorted array");
             for ( int i =0; i < arr.length;i++){

                 System.out.println(arr[i]+ " ");
             }


         }
     }






