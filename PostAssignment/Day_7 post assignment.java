package dsa_java;

public class mrgsrt {

    // Merge sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(arr, left, mid);

            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge both sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted parts of the array
    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of two temporary arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data into temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Merge temp arrays back into original array
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements (if any)
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] myArray = { 10, 3, 15, 7, 8, 23, 98, 29 };

        System.out.println("Before sorting:");
        printArray(myArray);

        mergeSort(myArray, 0, myArray.length - 1);

        System.out.println("After sorting:");
        printArray(myArray);
    }
}
