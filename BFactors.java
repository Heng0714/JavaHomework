import java.util.Scanner;
public class BFactors {

	public static void main(String[] args) {
	/* 2.	迴圏的練習-Factor
			輸入一正整數，求其所有的因數。
			說明：36的因數為1, 2, 3, 4, 6, 9, 12, 18, 36。 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("輸入你要取因數的數字，須為正整數");
	
		int inputNumber = scanner.nextInt();
		scanner.close();
		int factorResult = 0 ;
		int n = 1;
		while (n <= inputNumber) {
			if (inputNumber % n == 0) {
				factorResult = n;
				System.out.print(factorResult+ "\t");
			}

			// System.out.print(factorResult+ "\t"); // 一定print(inputNumber)次數，錯誤
			n++;
		} // end of while loop
		// System.out.print(factorResult+ "\t"); // 一定只print最後一個，錯誤
		


	} // end of main loop

}// end of class loop
