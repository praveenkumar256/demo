package adddon_dsa;

public class SoD {
	public static  int SumofDigit(int num) {
		if(num==0) {
			return 0;
		}
		return num+SumofDigit(num-1);
	}
	public static void main(String []args) {
		System.out.println(SumofDigit(7));
	}

}
