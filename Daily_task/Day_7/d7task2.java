package dsa_java;

public class qiksrt {

    // Quick sort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);  // Find pivot position
            quickSort(arr, low, pivotIndex - 1);         // Sort left part
            quickSort(arr, pivotIndex + 1, high);        // Sort right part
        }
    }

    // Partition function to arrange elements around a pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choose last element as pivot
        int i = low - 1;        // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] myArray = { 6, 3, 9, 5, 2, 8 };
        
        System.out.println("Before sorting:");
        printArray(myArray);

        quickSort(myArray, 0, myArray.length - 1);

        System.out.println("After sorting:");
        printArray(myArray);
    }
}
