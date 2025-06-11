package adddon_dsa;
class node1{
	int data;
	node1 next;
	node1 prev;
	node1(int d){
		this.data=d;
		this.next=null;
		this.prev=null;
	}
}

public class d4task1 {
	node1 head=null;
	node1 tail=null;
	public void insert(int val) {
		node1 newnode=new node1(val);
		if (head==null) {
			tail=newnode;
			head=newnode;
			newnode.next=null;
		}
		else {
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}
	}
	public void Traversal() {
		node1 temp=tail;
		while(temp.prev!=null) {
			System.out.println(temp.data+ "");
			temp=temp.prev;
		}
		System.out.println(temp.data);
	}
	public static void main (String []args) {
		d4task1 n=new d4task1();
		n.insert(1);
		n.insert(0);
		n.insert(3);
		n.insert(3);
		n.Traversal();
	}
}		
