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
public class d4task3 {
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
public void deletion() {
    node2 temp=head;
    int mid = size/2 ;
    while(--mid<0) {
    	temp=temp.next;
    }
    (temp.next).prev=temp.next.next;
    temp.next.next.prev=temp;
    temp.next.next.next=temp.next;
    temp.next=temp.next.next;
   
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
	d4task3 d=new d4task3();
	d.insert(2);
	d.insert(8);
	d.insert(9);
	d.deletion();
	d.display();
}
}


