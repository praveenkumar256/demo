package dsa_java;

class node {
    int data;
    node prev;
    node next;

    node(int data) {
        this.data = data;
    }
}

class revfrnt {
   
    node head = null;
    node tail = null;

    public void insert(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }

    void front() {
        node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); 
    }

    void backward() {
        node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
     public static void main(String[] args) {
        revfrnt on = new revfrnt();
        on.insert(1);
        on.insert(2);
        on.insert(3);
        on.insert(3);
        on.front();
        on.backward();
    }

  
}