
public class APower {

	/* 1.	��ƪ��m��-Power
			�g�@���int power(int x, int n)�Ψӭp��x��n����C
			�����Gpower(5,3)�Y�p��53�C */

	static int power (int x, int n) {
		int result = 1;
		for (int i =0 ; i<n; i++) {
			result *= x ;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(power(7,3));
	}

}
