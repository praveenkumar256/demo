package adddon_dsa;
class note{
	int data;
	note next;
	note(int data){
		this.data=data;
		this.next=null;
	}
}
public class D3task2 {
	note head;
	public void insertAtPosition(int pos,int data) {
		note newnote=new note(data);
		if (pos<1) {
			System.out.println("invalid");
		}
		if(pos==1) {
			newnote.next=head;
			head=newnote;
		}
		else {
			note current=head;
			for(int i=1;i<pos-1 && current != null;i++) {
				current=current.next;
			}
			if (current==null) {
				System.out.println("invalid position");
				return;
			}
			newnote.next=current.next;
			current.next=newnote;
		}
	}
		public void people() {
			note current=head;
			while(current!= null) {
				System.out.println(current.data +"");
				current=current.next;
		}
	}
		public static void main(String []args) {
			D3task2 list=new D3task2();
			list.head=new note(3);
			list.head.next=new note(9);
			list.head.next.next=new note(6);
			list.insertAtPosition(2, 7);
			list.people();
		}

}
