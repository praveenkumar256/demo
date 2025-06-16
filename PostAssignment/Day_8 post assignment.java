package dsa_java;

public class frqsrh {

    
    public static int firstIndex(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                result = mid;      
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    
    public static int lastIndex(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                result = mid;     
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

   
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int first = firstIndex(arr, target);
        int last = lastIndex(arr, target);

        if (first == -1 || last == -1) {
            System.out.println("Element not found.");
        } else {
            int frequency = last - first + 1;
            System.out.println("Element " + target + " occurs " + frequency + " times.");
        }
    }
}
