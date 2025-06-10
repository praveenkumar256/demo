package adddon_dsa;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
class revssl01 {
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
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        
    }
    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;     
            current.next = prev;    
            prev = current;          
            current = next;          
        }

        head = prev; 
    }
}

public class revssl {
    public static void main(String[] args) {
        revssl01 list = new revssl01();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original list:");
        list.display();

        list.reverse();

        System.out.println("Reversed list:");
        list.display();
    }
}
