package adddon_dsa;

class node{
	int data;
	node next;
	node(int d){
		this.data=d;
		this.next=null;
	}
}

public class D3task1 {
	node head;
	public static void Traversal(node head) {
		while(head!=null) {
			System.out.println(head.data+ "");
			head=head.next;
		}
		
	}
	public static void main (String []args) {
		D3task1 n=new D3task1();
		node head=new node(10);
		head.next=new node(20);
		head.next.next=new node(30);
		n.Traversal(head);
	}
}		