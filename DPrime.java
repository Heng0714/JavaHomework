
public class DPrime {

	/*4.	4.	��ƪ��m��-Prime
			�g�@���int prime (int n)�Ψӧ�X��n�ӽ�ơC*/

	static int prime( int x ) {
		int primeReturn = 2;
		int primeTest = 1;


		for (int i = 0; i < x;i++) {
			
			


				for (int testSample = 2; testSample < primeReturn; testSample++) {
					primeTest = primeReturn % testSample;
					if (primeTest ==0) {
						primeReturn++;
					}
					
				}
				

			primeReturn++;
				
		}// end of first for loop
		
		
		return primeReturn -1;
	} // end of method prime
	
	
	public static void main(String[] args) {
		System.out.println(prime(6));

	}

}