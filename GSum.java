
public class GSum {

	/* 7.	遞迴函數的練習-Sum
			寫一遞迴函數int sum (int n)用來計算2+4+6…+2n的值。*/

	static int recurisiveSum (int n) {
		 if (n == 1) {
	            return 2;
	        }
	        return (2*n) + recurisiveSum(n - 1);



	
	
	}
	
	public static void main(String[] args) {
		System.out.println(recurisiveSum(10));

	}

}
