
public class IStars {
	/* 9.	迴圈敘述的練習-Stars
   	畫出下列三種排列的星星圖形。

 		(1)	*         (2)   * * * * *    (3)  	  *
          	* *               * * * *           * * *
          	* * *               * * *         * * * * *  
          	* * * *               * *       * * * * * * *
          	* * * * *               *     * * * * * * * * *      */


	public static void main(String[] args) {
		for(int i = 1; i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}// end of 2nd for loop
		System.out.print("\n"); //next line
		}// end of 1st for loop
		System.out.print("\n"); // end of pattern 1
	
		for(int i = 1; i<=5;i++) {  // loop1 use to jump to next line
			for (int j=0;j< i-1;j++) { // print of space, loop2
				System.out.print(" ");
			}// end of 2nd for loop
			for (int k = 1; k <= 5-(i-1);k++) {// print of *, loop3
				System.out.print("*");
			}
			System.out.print("\n");  // now loop 1 jump to next line
		}// end of 1st for loop
		System.out.print("\n"); // end of pattern 2
		
		for(int i = 1; i<=5;i++) {  // loop1 use to jump to next line
			for (int j=0;j<= 5-i;j++) { // print of space, loop2
				System.out.print(" ");
			}// end of 2nd for loop
			for (int k = 1; k <= (2*i-1);k++) {// print of *, loop3
				System.out.print("*");
			}
			System.out.print("\n");  // now loop 1 jump to next line
		}// end of 1st for loop
		System.out.print("\n"); // end of pattern 3
		
		
		
		
		

	} 			// end of main

}				// end of class
