package dsa_java;

import java.util.Scanner;

//class node {
//    int data;
//    node prev, next;
//
//    node(int data) {
//        this.data = data;
//        this.prev = null;
//        this.next = null;
//    }
//}

public class menudll {
    node head = null, tail = null;

    public void insertAtBeginning(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Inserted at beginning: " + data);
    }

    public void insertAtEnd(int data) {
        node newNode = new node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Inserted at end: " + data);
    }

    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            System.out.println("Deleted from beginning: " + head.data);
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    }

    public void deleteFromEnd() {
        if (tail == null) {
            System.out.println("List is empty.");
        } else {
            System.out.println("Deleted from end: " + tail.data);
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        node current = head;
        System.out.print("List (Forward): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

  
    public void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        node current = tail;
        System.out.print("List (Backward): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        menudll dll = new menudll();
        Scanner sc = new Scanner(System.in);
        int choice, data;

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete from Beginning");
            System.out.println("4. Delete from End");
            System.out.println("5. Display Forward");
            System.out.println("6. Display Backward");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    dll.insertAtBeginning(data);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    dll.insertAtEnd(data);
                    break;
                case 3:
                    dll.deleteFromBeginning();
                    break;
                case 4:
                    dll.deleteFromEnd();
                    break;
                case 5:
                    dll.displayForward();
                    break;
                case 6:
                    dll.displayBackward();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
