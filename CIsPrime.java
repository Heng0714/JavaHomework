
public class CIsPrime {
	
		/* 3.	��ƪ��m��-IsPrime
				�g�@���boolean isPrime (int n)�ΨӧP�_n�O�_����ơC */
	


	static boolean isPrime( int x) {  // ���L�����ӥ�
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
