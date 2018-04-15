
public class APower {

	/* 1.	函數的練習-Power
			寫一函數int power(int x, int n)用來計算x的n次方。
			說明：power(5,3)即計算53。 */

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
