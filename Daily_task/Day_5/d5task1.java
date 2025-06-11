package adddon_dsa;

public class d5task1 {
	node last;
	class node{
		int data;
		node next;
		node(int num){
			data=num;
			next=null;
		}
	}

	public void insert(int num) {
		node newnode=new node(num);
		if(last==null) {
			newnode.next=newnode;
			last=newnode;
		}
		else {
			newnode.next=last.next;
			last.next=newnode;
			last=newnode;
		}
	}
	public void display() {
		node temp=last.next;
		do {
			System.out.println(temp.data);
			temp=temp.next;
		}while(temp!=last);
		System.out.println(temp.data);
	}
	public static void main(String args[]) {
		d5task1 c=new d5task1();
		c.insert(4);
		c.insert(2);
		c.insert(12);
		c.insert(8);
		c.display();
	}

}
