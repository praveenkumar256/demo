package day9;

import java.util.Arrays;
import java.util.Scanner;

public class day9_mainprogram {
	public static void rank(int[] a ,int size) {
		float [] R=new float[size];
		for(int i=0;i<size;i++) {
			int r=0,s=0;
			for(int j=0;j<size;j++) {
				if(j!=i && a[i]<a[j]) {
					r+=1;
				}
				if(j!=i && a[i]==a[j]) {
					s+=1;
				}
			}
			R[i] = r + (float)(s - 1) / (float) 2;
		}
		for (int i = 0; i < size; i++)
            System.out.print(R[i] + "  ");
        
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
		Arrays.sort(a);
		rank(a,size);
	}
}
