package adddon_dsa;
import java.util.Scanner;
class node01{
int data;
node01 next;
node01(int data){
  this.data=data;
	this.next=null;
}
}
public class d5task2 {
	node01 last;
	public void insert(int data) {
		node01 newNode=new node01(data);
		if(last==null) {
			newNode.next=newNode;
			last=newNode;
		}
		else {
			newNode.next=last.next;
			last.next=newNode;
			last=newNode;

		}
	}
	public void lstins(int v) {
		node01 newNode=new node01(v); 
		node01 temp = last;
		newNode.next=temp.next;
		temp.next=newNode;
		last=newNode;

	}
	public void display() {
		node01 temp = last.next;
     do {
          System.out.print(temp.data + " ");
          temp = temp.next;
      } while (temp != last);

     System.out.print(temp.data);
     System.out.println("last "+last.data);

	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		d5task2 c=new d5task2();
        System.out.println("Enter the Number of elements to be added:");
        int n=sc.nextInt();
        System.out.println("Enter the numbers:");
        for(int i=0;i<n;i++) {
        	int val=sc.nextInt();
        	c.insert(val);
        }

		c.display();
		c.lstins(7);
		System.out.println("Instert at end:");
		c.display();
		System.out.println();

	}

}


