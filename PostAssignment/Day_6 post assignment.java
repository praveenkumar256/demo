package adddon_dsa;

class Node11 {
    int data;
    Node11 next;

    Node11(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class using Linked List
class Stack {
    Node11 top = null;

    // Push operation
    void push(int value) {
        Node11 newNode = new Node11(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + value);
    }

    // Pop operation
    void pop() {
        if (top == null) {
            System.out.println("Stack is empty (Underflow)");
        } else {
            System.out.println("Popped: " + top.data);
            top = top.next;
        }
    }

    // Display stack
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack (top to bottom): ");
            Node11 current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}

// Main class to test
public class llstkop {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.pop();
        stack.display();

        stack.push(40);
        stack.display();
    }
}
