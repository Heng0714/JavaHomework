
public class BSigma {
		/* 	2.	��ƪ��m��-Sigma
				�g�@���double my_fun (double x, int n)�p�U�G
 
				���ܡG�Q�ΤW�D��power(x,n)�M�Ұ�W��factorial(n)�ӧ����C */

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
