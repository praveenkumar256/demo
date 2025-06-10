package adddon_dsa;

import java.util.Scanner;



class LinkedList {
    node head;

    void insert(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    void deleteAt(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Position out of range");
            return;
        }

        temp.next = temp.next.next;
    }

    void reverse() {
        node prev = null;
        node current = head;
        node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class D3task4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Insert at end");
            System.out.println("2. Delete at position");
            System.out.println("3. Display list");
            System.out.println("4. Reverse list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    int data = sc.nextInt();
                    list.insert(data);
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    int pos = sc.nextInt();
                    list.deleteAt(pos);
                    break;
                case 3:
                    System.out.println("Linked list:");
                    list.display();
                    break;
                case 4:
                    list.reverse();
                    System.out.println("List reversed.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

 
    }
}