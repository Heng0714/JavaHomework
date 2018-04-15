
public class DPrime {

	/*4.	4.	ㄧ计絤策-Prime
			糶ㄧ计int prime (int n)ノㄓт材n借计*/

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