
public class EMersennePrime {
	/*5.	��ƪ��m��-MersennePrime
	�g�@���boolean mersennePrime (int n)�ΨӧP�_n�O�_��Mersenne��ơC���g�@�{����X�e8��Mersenne��ơC
	���ܡG�Y��ƺ���2P-1=n (p�������)�A�hn��Mersenne Prime�C
	�����G��p=3�ɡA2^3-1=7�A�G7��Mersenne Prime�C*/

	static boolean isPrime(int x) {
		boolean isAPrime = true;
		int i = 2;
		
		A:while (i<x) {
			if ( x % i ==0) {
				isAPrime = false;
				break A;
			}
			i++;
		}
		if (x==1) {
			isAPrime = false;	
		}
		
		return isAPrime;
	}
	
	static boolean isMersenne (int y) {
		boolean isAMersenne = false;
		if (isPrime(y) == false) {
//			System.out.println("your input is not a prime, please change to a prime number");	
			}
		else {
			double k = Math.log(y+1)/Math.log(2);		
			isAMersenne = (k == (int) k);
		}
		
		return isAMersenne;
		
	}// end of method isMersenne
	
	static String firstXMersenne (int z) {
		System.out.printf("the first %d Mersenne number are:\t",z);
		int j = 0;
		boolean testMersenee = false;
		for (int i = 0; i < z; i++) {
			A:	while (true) {
				j++;
				testMersenee = isMersenne(j);
				if (testMersenee == true) {
					System.out.print(j+", ");
					
					break A;
				}
				
			}// end of A
		}// end of for loop
	 return ("\nthank you for use");
	}

	
	
	public static void main(String[] args) {
		System.out.println(firstXMersenne(8));

	}
}