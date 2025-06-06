package adddon_dsa;

import java.util.Arrays;

public class TwoPointer {
	public static void main(String []args) {
		int [] a= {4,5,8,6,2};
		Arrays.sort(a);		
		int left=0;
		int right=a.length-1;
		while(left<right) {
			int temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;			
		}
		System.out.println(Arrays.toString(a));
	}

}
