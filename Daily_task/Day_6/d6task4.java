package dsa_java;

class Queue {
    int size = 5;
    int front = 0, rear = 0;
    int[] queue = new int[size];

    // Add value to the queue
    void enqueue(int value) {
        if (rear == size) {
            System.out.println("Oops! The queue is full.");
        } else {
            queue[rear] = value;
            rear++;
            System.out.println("Added " + value + " to the queue.");
        }
    }

    // Remove value from the queue
    void dequeue() {
        if (front == rear) {
            System.out.println("Oops! The queue is empty.");
        } else {
            System.out.println("Removed " + queue[front] + " from the queue.");
            front++;
        }
    }

    // Show the current queue
    void display() {
        if (front == rear) {
            System.out.println("The queue is currently empty.");
        } else {
            System.out.print("Current queue: ");
            for (int i = front; i < rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

public class qu {
    public static void main(String[] args) {
        Queue q = new Queue();

        // Example actions
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // This should show "queue is full"
        q.display();
    }
}