
public class FRope {

	public static void main(String[] args) {
		double originRope = 3000;
		double ropeRemain = originRope;
		int dayUse = 0;
			while (true) {
				ropeRemain /= 2;
				
				dayUse ++;
				if (ropeRemain <= 5) break;

			}// end of while loop
		System.out.printf("�@�q���%7.1f��÷�l�A�C�Ѵ�h�@�b���סA�b%d�ѫ�|�u�󤭤���",originRope,dayUse );

	}

}
