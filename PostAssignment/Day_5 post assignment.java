package day5;

import java.util.Scanner;

public class postassignment {
	int size=0;
	node last=null;
	public void insert(int val) {
		node newnode=new node(val);
		if(last==null) {
			newnode.next=newnode;
			last=newnode;
		}
		else {
			 newnode.next=last.next;
			 last.next=newnode;
			 last=newnode;
		}
		size++;
	}
	public void insertatend(int val) {
		node newnode=new node(val);
			newnode.next=last.next;
			last.next=newnode;
			last=newnode;
			size++;
		}
	public void delatbeg() {
		node temp=last.next;
		last.next = temp.next;
		size--;
	}
	public void delatpos(int pos) {
		node temp=last;
		for(int i=1;i<pos;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		size--;
	}
	public void display() {
		node temp=last.next;
		while(true) {
			System.out.println(temp.data+" ");
			temp=temp.next;
			if(temp==last.next) {
				break;
			}
	}
}
	public static void main(String[]args) {
		postassignment n=new postassignment();
		 Scanner sc = new Scanner(System.in);
	     int choice, data;

	        while (true) {
	            System.out.println("\n--- Menu ---");
	            System.out.println("1. Insert at Beginning");
	            System.out.println("2. Insert at End");
	            System.out.println("3.  Delete from Beginning");
	            System.out.println("4. Delete from any postion");
	            System.out.println("5.  length of list");
	            System.out.println("6.   Display");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter data: ");
	                    data = sc.nextInt();
	                    n.insert(data);
	                    break;
	                case 2:
	                    System.out.print("Enter data: ");
	                    data = sc.nextInt();
	                    n.insertatend(data);
	                    break;
	                case 3:
	                    n.delatbeg();
	                    break;
	                case 4:
	                	 System.out.print("Enter data: ");
		                  data = sc.nextInt();
	                     n.delatpos(data);
	                    break;
	                case 5:
	                	System.out.println(n.size);
	                	break;
	                case 6:
	                    n.display();
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

