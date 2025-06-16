package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Day8_task2 {
	public static void binary1(int []a,int t) {
		int start=0;
		int end=a.length-1;
		int mid=(start+end)/2;
		binary(start,end,mid,a,t);
	}
		public static void binary(int start,int end,int mid,int[] a,int t) {
			if(a[mid]==t) {
				System.out.println("found->"+a[mid]+"\nindex->"+mid);
				return;
			}
			else if(a[mid]<t) {
				start=mid+1;
				binary(start,end,mid,a,t);
			}
			else if(a[mid]>t) {
				end=mid-1;
				binary(start,end,mid,a,t);
			}
				//System.out.println("not founds");
		}
		

	
	public static void main(String[] args) {
		Scanner n =new Scanner(System.in);
		System.out.println("Enter a size of Array");
		int size=n.nextInt();
		int [] a=new int[size];
		System.out.println("Enter a element of arrays:");
		for(int i=0;i<a.length;i++) {
			int e=n.nextInt();
			a[i]=e;
		}
		System.out.println("Enter a target of Array");
		int t=n.nextInt();
		Arrays.sort(a);
		binary1(a,t);
}
}