
public class CIsPrime {
	
		/* 3.	函數的練習-IsPrime
				寫一函數boolean isPrime (int n)用來判斷n是否為質數。 */
	


	static boolean isPrime( int x) {  // 做過的拿來用
		boolean havePrime = false; // return prime number test
		int testNumber = 0;
			A:	for (int i = 2; i < x; i++) {
					testNumber = x % i;
					
					if (testNumber == 0) break A;
					} // end of for loop
				if (x == 2) {
						testNumber = 1;
				}
			havePrime = (testNumber == 0)? false:true;
		return havePrime;
	} // end of primeNumberTest
	
	public static void main(String[] args) {
		System.out.println(isPrime(13));

	}

}
