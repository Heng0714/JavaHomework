
public class ERefund {

	public static void main(String[] args) {
	/* 5.	��ܩʱԭz���m��-Refund
			��J�b�Y�ө��ʪ����I���B�P��I���B�C
			��I���B�p�����I���B�A�h�L�X�����B�������C
			��I���B�������I���B�A�h�L�X������������C
			��I���B�j�����I���B�A�h��X��^���B�̤֪��r���ƩM�����ơC
			���]���ȥu��1000, 500, 100���ȶr�M50, 10, 5, 1���w���C
			�����G�Y�R�F132�����ӫ~�A�I1000���A����^�@�i500���A
			�T�i100���A�@��50���w���A�@��10���w���A�@��5���w���M�T��1���w���C */

		int acualPaid = 1531;
		int cost =428;
		boolean enough = (acualPaid>=cost);
		boolean eqeq = (acualPaid==cost);
		int exchange = (acualPaid-cost);
		int tN = (exchange / 1000);
		int fHN = (exchange % 1000) / 500;
		int oHN = (exchange % 500)/ 100;
		int fftyC = (exchange % 100)/ 50;
		int tC = (exchange % 50)/ 10;
		int fC = (exchange % 10)/ 5;
		int oC = (exchange % 5);
		
		if (enough == false) {
			System.out.println("���B����");
		}else {
			if(enough == true && eqeq == true) {
				System.out.println("�������");
			}else {
				System.out.printf("��z1000���r��%d�i�A��z500���r��%d�i�A100���r��%d�i�A50���w��%d�ӡA10���w��%d�ӡA5���w��%d��"
						+ "�A1���w��%d�ӡA�Ьd��", tN,fHN,oHN,fftyC,tC,fC,oC );
			}
			
			
		}
		
	}

}
