package adddon_dsa;
import java.util.Arrays;
import java.util.Scanner;

public class d9task2 {
	public static void main(String []args) {
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
	

}


