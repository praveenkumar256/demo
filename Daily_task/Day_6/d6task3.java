package adddon_dsa;

import java.util.Arrays;

public class d6task3 {
	int[] arr=new int[5];
	int rear;
	int front;
	d6task3() {
		rear=-1;
		front=-1;
	}
		public void eq(int num) {
			if(rear==4) {
				System.out.print("overflow");
			}
			else {
				arr[++rear]=num;
				
			}
		
		}
		
		public void dq() {
			if(front==4) {
				System.out.println("empty");
			}
			else {
				arr[++front]=0;
			}
			
			}
		public void disp() {
			System.out.print(Arrays.toString(arr));
			}
		
		public static void main(String[] ags) {
			d6task3 s=new d6task3();
			s.eq(10);
			s.eq(20);
			s.eq(30);
			s.eq(40);
			s.eq(50);
			
			//s.disp();
			s.dq();
			s.disp();
			
}
}
