
public class DLeapYear {

	public static void main(String[] args) {
	/* 4.	��ܩʱԭz���m��-LeapYear
			��J�@�褸�~�A�p2015�C�P�_���~���O�_���|�~�C
			���ܡG�C�|�~�@�|�A�C�ʦ~���|�A�C�|�ʦ~�@�|�A�C�|�d�~���|�C */
		
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
		
		if (resultB == true) {resultString = "�O�|�~" ;
				}else{resultString = "���O�|�~";}
		
		System.out.printf("%d�~�g�p��%s%n", yearInput,resultString);
	}

}
