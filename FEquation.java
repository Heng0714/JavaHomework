
public class FEquation {

	public static void main(String[] args) {
	/* 6.	��ܩʱԭz���m��-Equation
			�@���G����{��ax2+bx+c=0�C��Ja, b, c�T�ȡA�íp���{�����ڡC */

		double a = 1;
		double b = 2;
		double c = 5;
		double rootAA = (-b+Math.sqrt((b*b)-(4*a*c)))/(2 * a);
		
		double rootBB = (-b-Math.sqrt((b*b)-(4*a*c)))/(2 * a);
		double think = (b*b)-(4*a*c);
		//System.out.printf("think%8.3f%n",think);
		
		if (think < 0) {
			System.out.println("�S�����");
		}else {
			if(think == 0) {
			System.out.printf("���۵����%8.3f",rootAA);	
			}else {
				System.out.printf("���۲����%15.3f�A�H��%15.3f",rootAA,rootBB);	
			}
		}
	}

}
