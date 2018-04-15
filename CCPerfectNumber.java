
public class CCPerfectNumber {

	

	static int factorResultSum(int x) {  // this method return the factor sum of a number, not including itself
		int rofrs = 0; // return of factor result sum
		for (int i=1; i<x; i++) {
			if (x%i == 0)
			rofrs += i;
		} // end of for loop
	
		return rofrs;
	} // end of factorResultSum
	
	public static void main(String[] args) {
		int inputNumber = 100;
		for (int j=1; j<=inputNumber; j++) {
			if (j == factorResultSum(j)) {
				System.out.print(j + "\t");
			}

		}// end of for loop

	}// end of main

}// end of class