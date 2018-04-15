
public class DLeapYear {

	public static void main(String[] args) {
	/* 4.	選擇性敘述的練習-LeapYear
			輸入一西元年，如2015。判斷此年份是否為閏年。
			提示：每四年一閏，每百年不閏，每四百年一閏，每四千年不閏。 */
		
		int yearInput = 1964;
		boolean resultB;
		String resultString;
		boolean four;
		boolean hundread;
		boolean fourHundread;
		boolean fourThousand;
		
		
		four = ((yearInput % 4) == 0);
		hundread = ((yearInput % 100) == 0);
		fourHundread = ((yearInput % 400) == 0);
		fourThousand = ((yearInput % 4000) == 0);

		// System.out.printf("4:%b%n", four);  
		// System.out.printf("N100:%b%n", !hundread); 
		// System.out.printf("400:%b%n", !fourHundread);
		// System.out.printf("N4000:%b%n", !fourThousand);
		
		resultB = four && ((four && !hundread) || (fourHundread)) && (!fourThousand) ;
		 // System.out.printf("total:%b%n", resultB);
		
		if (resultB == true) {resultString = "是閏年" ;
				}else{resultString = "不是閏年";}
		
		System.out.printf("%d年經計算%s%n", yearInput,resultString);
	}

}
