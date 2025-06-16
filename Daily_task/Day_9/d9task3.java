package adddon_dsa;
import java.util.Arrays;
import java.util.Scanner;

public class d9task3 {
	public  void task(int[]arr,int target) {
		int left=0;
		int right=arr.length;
		int mid = 0 ;  
		
		while(left<right) {
			mid=(left+right)/2;
			if(arr[mid]<target) {
				left=mid+1;
			}
			else if(arr[mid]>=target){
				right=mid;
			}
		}
		if(left== right ) {
			System.out.println("found in index "+left+" at value "+arr[left]);
			
		
		}
		}
	public void count(int[]arr,int target) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				count++;
			}
		}
		System.out.println("count="+count);
	}
		public static void main(String []args) {
			d9task3 o=new d9task3();
			Scanner n=new Scanner(System.in);
			System.out.println("enter the size:");
			int Size=n.nextInt();
			int[] arr=new int[Size];
			
			System.out.println("Enter the value:");
			for( int i=0;i<Size;i++) {
				arr[i]=n.nextInt();
			}
			Arrays.sort(arr);
			System.out.println("Enter the target:");
			int target=n.nextInt();
			o.task(arr,target);
			o.count(arr, target);
	}
	

}



