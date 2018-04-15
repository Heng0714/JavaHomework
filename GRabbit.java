
public class GRabbit {
	/*	7.	迴圏的練習-Rabbit
			老王養了一群兔子，若三隻三隻一數，剩餘一隻；若五隻五隻一數，
			剩餘三隻；若七隻七隻一數，剩餘二隻。試問兔子最少有幾隻。 */


	
	public static void main(String[] args) {
		int rabbitGuess = 1; 
		boolean r3A1 = false;
		boolean r5A3 = false;
		boolean r7A2 = false;		
		boolean allCondition = false;
	
			while (true) {
				r3A1 = (rabbitGuess %3 == 1);
				r5A3 = (rabbitGuess %5 == 3);
				r7A2 = (rabbitGuess %7 == 2);
				allCondition = (r3A1 && r5A3 && r7A2);
				if (allCondition == true) break;
				rabbitGuess ++;
				} // end of while loop
		
		System.out.printf("我猜有%d隻兔子", rabbitGuess);
	
	
	
	} 		// end of main

}			// end of class