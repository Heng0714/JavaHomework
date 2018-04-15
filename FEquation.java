
public class FEquation {

	public static void main(String[] args) {
	/* 6.	選擇性敘述的練習-Equation
			一元二次方程式ax2+bx+c=0。輸入a, b, c三值，並計算方程式的根。 */

		double a = 1;
		double b = 2;
		double c = 5;
		double rootAA = (-b+Math.sqrt((b*b)-(4*a*c)))/(2 * a);
		
		double rootBB = (-b-Math.sqrt((b*b)-(4*a*c)))/(2 * a);
		double think = (b*b)-(4*a*c);
		//System.out.printf("think%8.3f%n",think);
		
		if (think < 0) {
			System.out.println("沒有實根");
		}else {
			if(think == 0) {
			System.out.printf("有相等實根%8.3f",rootAA);	
			}else {
				System.out.printf("有相異實根%15.3f，以及%15.3f",rootAA,rootBB);	
			}
		}
	}

}
