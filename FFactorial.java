
public class FFactorial {

	static int factorialCal( int x) {
		int resultFactorial = 1;
		for (int j = x; j>=1;j--) {
			resultFactorial *= j;	
			
		}
			return resultFactorial;
	}
	
	public static void main(String[] args) {
	System.out.println(factorialCal(8));

	}

}
