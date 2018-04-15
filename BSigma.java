
public class BSigma {
		/* 	2.	函數的練習-Sigma
				寫一函數double my_fun (double x, int n)如下：
 
				提示：利用上題的power(x,n)和課堂上的factorial(n)來完成。 */

	static double my_fun (double x, int n) {
		double my_funResult = 0;
		double resultFactorial =1;
		double resultPower = 1;
		for (int i =1;i<=n;i++ ) {
			resultFactorial *= i;
			resultPower = Math.pow(x, i);
			my_funResult = my_funResult +(resultPower/resultFactorial);
					
		}
		
		
		
		return my_funResult;
	} // end of my_fun
	
	public static void main(String[] args) {
		System.out.println(my_fun(12,3));

	}

}
