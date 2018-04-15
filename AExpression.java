
public class AExpression {
	public static void main(String[] args) {
		
		/* 1.	迴圏的練習-Expression
				利用for迴圏計算1^2-2^2+3^2-4^2+…+49^2-50^2的值。 */
		int i ;
		int j ;
		double result = 0;
		 	for (i = 1 ; i <= 50; i += 2) {
				result += Math.pow(i,2);
		 	}
		 	for (j = 2; j <= 50; j += 2) {
		 		result -= Math.pow(j,2);
			}

	  System.out.println(result);	
	}// end of main loop

} // end of public loop