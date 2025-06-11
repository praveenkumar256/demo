package adddon_dsa;

public class d5task3 {
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
	}
	public void delatbeg() {
		node temp=last.next;
		last.next = temp.next;
	
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
	public static void main(String[] args) {
		d5task3 n=new  d5task3();
		n.insert(1);
		n.insert(2);
		n.insert(3);
		n.display();
		System.out.println("delete at beginning");
		n.delatbeg();
		n.display();
	}
}
