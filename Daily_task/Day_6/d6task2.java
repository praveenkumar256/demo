package adddon_dsa;

import java.util.Scanner;

public class d6task2 {
	int[] stack;
	int size;
	int top=-1;
	int msize;
	public void start(int val) {
		stack =new int[val];
		size=val;
		--size;
	}
	public void push(int n) {
		if(top==size) {
			System.out.println("overflow");
		}
		else {
			stack[++top]=n;
		}
		//System.out.println(size);
		}
	public void pop() {
		if(top==-1) {
			System.out.println("underflow");
		}
		else 
			//System.out.print();
			--top;
	}
	public void seek() {
		if(top==-1) {
			System.out.println("underflow");
		}else
		    System.out.println(stack[0]);
	}
	public void peek() {
		if(top==-1) {
			System.out.println("underflow");
		}else {
		System.out.println(stack[top]);
		}
	}

	public void display() {
		if(top==-1) {
			System.out.println("stack is empty");
		}
		for(int i=0;i<=top;i++) {
			System.out.println(stack[i]);
		}
		
	}
	public static void main(String[]args) {
		 d6task2 n=new  d6task2();
		 Scanner sc = new Scanner(System.in);
	     int choice, data;
	     System.out.println("Enter a size of Stack:");
	     int e=sc.nextInt();
	     n.start(e);
	        while (true) {
	            System.out.println("\n--- Menu ---");
	            System.out.println("1. push");
	            System.out.println("2. pop");
	            System.out.println("3. seek");
	            System.out.println("4. peek");
	            System.out.println("5. Display");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                	 System.out.print("Enter data: ");
		                 data = sc.nextInt();
		                 n.push(data);
	                    break;
	                case 2:
	                    n.pop();
	                    break;
	                case 3:
	                    n.seek();
	                    break;
	                case 4:
	                	n.peek();
	                    break;
	                case 5:
	                	n.display();
	                	break;
	                case 6:
	                	 System.out.println("Exiting...");
	                	 System.exit(0);
		                 sc.close();
		                 return;
	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }
	    }
}
