package dsa_java;

//class Node {
//    int data;
//    Node next;
//    
//    Node(int data) {
//        this.data = data;
//    }
//}

class delssl01 {
    Node head;
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }
   void deleteAt(int pos) {
    if (head == null) return;

    if (pos == 1) { 
        head = head.next;
        return;
    }

    Node temp = head;
    for (int i = 1; i < pos - 1; i++) {
        if (temp == null || temp.next == null) return; 
        temp = temp.next;
    }

    if (temp.next == null) return; 
    temp.next = temp.next.next;
}

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
public class delssl {
    public static void main(String[] args) {
        delssl01 list = new delssl01();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original list:");
        list.display();

        list.deleteAt(1);
        System.out.println("\nAfter deleting at position specified:");
        list.display();
    }
}