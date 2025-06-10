package adddon_dsa;

import org.w3c.dom.Node;

class D3task3 {
    node head;
    void insert(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newnode;
    }
   void deleteAt(int pos) {
    if (head == null) return;

    if (pos == 1) { 
        head = head.next;
        return;
    }

    node temp = head;
    for (int i = 1; i < pos - 1; i++) {
        if (temp == null || temp.next == null) return; 
        temp = temp.next;
    }

    if (temp.next == null) return; 
    temp.next = temp.next.next;
}

    void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
public class delssl {
    public static void main(String[] args) {
    	D3task31 list = new D3task3();
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