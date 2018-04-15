import java.util.Scanner;
public class EPrime {

	/* 5.	迴圈的練習-Prime
			輸入一正整數，找出所有小於或等於的質數。*/
	static boolean primeNumberTest( int x) {
		boolean havePrime = false; // return prime number test
		int testNumber = 0;
			A:	for (int i = 2; i < x; i++) {
					testNumber = x % i;
					
					if (testNumber == 0) break A;
					} // end of for loop
				if (x == 2) {
						testNumber = 1;
				}
			havePrime = (testNumber == 0)? true:false;
		return havePrime;
	} // end of primeNumberTest
	
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("請輸入要找質數的數字，須為正整數");	
	int input =scanner.nextInt();
	scanner.close();
		
//	int input = 100; // input no longer used
		for (int j = 1 ; j < input ; j++) {
			if (primeNumberTest(j)== false) {
				System.out.print(j + "\t");
			}
		}// end of for loop

		
//		int x = 79;
//		boolean havePrime = false; // return prime number test
//		int testNumber = 0;
//			A:	for (int i = 2; i < x; i++) {
//					testNumber = x % i;
//					if (testNumber == 0) break A;
//					} // end of for loop
//			havePrime = (testNumber == 0)? true:false;
//		System.out.println(havePrime);						//code testing


	}               //end of main

}                   // end of class
