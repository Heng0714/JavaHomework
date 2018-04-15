
public class CIsPrime {
	
		/* 3.	ㄧ计絤策-IsPrime
				糶ㄧ计boolean isPrime (int n)ノㄓ耞n琌借计 */
	


	static boolean isPrime( int x) {  // 暗筁ㄓノ
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
