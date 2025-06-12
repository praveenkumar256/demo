package adddon_dsa;

public class d6task1 {
	int[] stack=new int[5];
	int top=-1;
	public void push(int data) {
		if (top==4) {
			System.out.println("overflow");
			}
		else {
			stack[++top]=data;
		}
	}
	public void pop() {
		if (top==-1) {
			System.out.println("underflow");
		}
		else {
			--top;
		}
	}
	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.println(stack[i]);
			
		}
	}
	public static void main(String []args) {
		d6task1 an=new d6task1();
		an.push(3);
		an.push(6);
		an.push(7);
		an.push(8);
		an.push(12);
		an.display();
		/*an.pop();
		an.pop();*/
		an.pop();
		an.push(5);
		System.out.println("");
		an.display();
		
	}
}
