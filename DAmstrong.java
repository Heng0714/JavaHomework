
public class DAmstrong {
	/* 		4.	餈游��毀蝧�-Amstrong
			Amstrong�����������嚗���銋����閰脫�頨怒��
			�������mstrong���
			隤芣���153=13+53+33嚗��153�Amstrong���*/
	

//	static int amstrongTest(int x) {  // this method return the result of amstrong test
//		int roamt = 0; // return of amstrong test
//		int h = 0;
//		int t = 0;
//		int o = 0;
//		for (int i=100; i<x; i++) {
//			h = i / 100 ;
//			t = (i / 10) % 10 ;
//			o = i % 10;
//			roamt = (h*h*h) + (t*t*t) + (o*o*o);
			
//		} // end of for loop
	
//		return roamt;
//	} // end of factorResultSum
	
	public static void main(String[] args) {
		
//		for (int j=100; j<=999; j++) {
//			if (j == amstrongTest(j)) {
//				System.out.print(j + "\t");
//			}

//		}// end of for loop
		int roamt = 0, h = 0, t = 0 , o = 0;
		for (int i=100; i<999; i++) {
			//int i =153;
			h = i / 100 ;
			t = (i / 10) % 10 ;
			o = i % 10;
			roamt = (h*h*h) + (t*t*t) + (o*o*o);
			//System.out.println(roamt);
			if (i == roamt) {
				System.out.print(i + "\t");
			}
		
		}
		
		
	}// end of main

}// end of class