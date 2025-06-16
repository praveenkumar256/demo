package adddon_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class d8task1 {

	public static void main(String[] args) {
		int arr[]= {12,3,5,67,34};
		System.out.println(Arrays.toString(arr));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to found:");
		int find=sc.nextInt();
	
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==find) {
				System.out.println("value found at index:"+arr[i]+" at position"+i);
				flag=true;
				break;
			}
	}	
		if(flag==false) {
			System.out.println("value not found");
		}
		sc.close();
	}

}
