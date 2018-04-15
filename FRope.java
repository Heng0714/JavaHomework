
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
		System.out.printf("一段原長%7.1f的繩子，每天減去一半長度，在%d天後會短於五公尺",originRope,dayUse );

	}

}
