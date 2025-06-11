package adddon_dsa;
import java.util.Arrays;
import java.util.Scanner;
public class task2 {
	public static void main(String []args) {
		Scanner arr=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=arr.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		int t;
		System.out.println("Enter the array value");
		for(int i=0;i<size;i++) {
			a[i]=arr.nextInt();
		}
		for(int l=0;l<size;l++) {
			b[l]=a[l];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		for(int j=0;j<size;j++) {
			for(int k=j+1;k<size;k++) {
				if(b[j]<b[k]) {
					t=b[j];
					b[j]=b[k];
					b[k]=t;
				}
			}
		}
		System.out.println("decending");
		System.out.println(Arrays.toString(b));
	}

}
