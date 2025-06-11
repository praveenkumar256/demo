package adddon_dsa;

import java.util.Scanner;

public class arrayoperation {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int size = 0;
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Insert\n2. Delete\n3. Update\n4. Show\n5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (size >= arr.length) {
                        System.out.println("Array is full");
                        break;
                    }
                    System.out.print("Enter number to insert: ");
                    arr[size] = sc.nextInt();
                    size++;
                    System.out.println("Inserted.");
                    break;

                case 2:
                    System.out.print("Enter position to delete (0 to " + (size - 1) + "): ");
                    int delPos = sc.nextInt();
                    if (delPos < 0 || delPos >= size) {
                        System.out.println("Invalid position");
                        break;
                    }
                    for (int i = delPos; i < size - 1; i++) {
                        arr[i] = arr[i + 1];
                    }
                    size--;
                    System.out.println("Deleted.");
                    break;

                case 3:
                    System.out.print("Enter position to update (0 to " + (size - 1) + "): ");
                    int updPos = sc.nextInt();
                    if (updPos < 0 || updPos >= size) {
                        System.out.println("Invalid position");
                        break;
                    }
                    System.out.print("Enter new value: ");
                    arr[updPos] = sc.nextInt();
                    System.out.println("Updated.");
                    break;

                case 4:
                    System.out.print("Array: ");
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}


