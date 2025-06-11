package adddon_dsa;
class  node2{
	int data;
	node2 next;
	node2 prev;
	node2(int d){
		this.data=d;
		this.next=null;
		this.prev=null;
	
	}
}
public class d4task2 {
	int size=0;
	node2 head;
	node2 tail;
	public void insert(int val) {
		node2 newnode=new node2(val);
		if (head==null) {
			tail=newnode;
			head=newnode;
			newnode.next=null;
		}
		if(head!=null) {
			head.prev=newnode;
			newnode.next=head;
			head=newnode;
			size++;
		}
	}
	public void Middle(int data) {
        node2 newnode = new node2(data);
        node2 temp=head;
        int mid=size/2;
        while(--mid<0) {
        	temp=temp.next;
        }
        (temp.next).prev=newnode;
        newnode.prev=temp;
        newnode.next=temp.next;
        temp.next=newnode;
        size++;
	}
	public void display() {
		node2 temp=tail;
		while(temp.prev!=null) {
			System.out.println(temp.data);
			temp=temp.prev;
		}
		System.out.println(temp.data);
	}
	public static void main(String[] args) {
		d4task2 d=new d4task2();
		d.insert(2);
		d.insert(8);
		d.Middle(9);
		d.display();
	}
}