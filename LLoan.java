
public class LLoan {
/* ������H100000�����O�V�Ȧ�B��Q�M�a�U�����ɶU�C�Y�Ȧ檺�~�Q�v��20%�A
 ��Q��Q�v��10%�M�a�U������Q�v��1%�C�H�묰���A�p��@�Ӥ��ܤ@�~��C�Ӥ���k�٦h�ֿ��C*/
	
	public static void main(String[] args) {
	
		double rateBank = 0.20/12;
		double ratePawnshop = 0.1 ;
		double rateYakuza = 0.01*30;
		
		double principle = 100000;
		
		double payBank = 0;
		double payPawnshop = 0;
		double payYakuza = 0;
		
		double payBank1 = 0;
		double payPawnshop1 = 0;
		double payYakuza1 = 0;
		
		System.out.printf("�Ȧ��Q�v��%7.3f%%%n��Q��Q�v��%7.3f%%%n�a�U������Q�v��%7.3f%%%n%n",rateBank*100,ratePawnshop*100,rateYakuza*100);

		//�Ȧ�ɶU
		
		
		
		for (int i = 1; i<=12;i++) {
			payBank=100000*Math.pow((1+rateBank),i);
			System.out.printf("�V�Ȧ�ɶU%d�Ӥ�����v�٪����Q�X��\t%,10.0f%n",i,payBank);
		}// end of for loop - bank
		
		//��Q�ɶU
		System.out.print("\n");
		for (int j = 1; j<=12;j++) {
			payPawnshop=100000*Math.pow((1+ratePawnshop),j);
			System.out.printf("�V��Q�ɶU%d�Ӥ�����v�٪����Q�X��\t%,10.0f%n",j,payPawnshop);
		}// end of for loop - Pawnshop
		
		//�a�U�����ɶU
		System.out.print("\n");
		for (int k = 1; k<=12;k++) {
			payYakuza=100000*Math.pow((1+rateYakuza),k);
			System.out.printf("�V�a�U����%d�Ӥ�����v�٪����Q�X��\t%,10.0f%n",k,payYakuza);
			System.out.print("\n");
		}// end of for loop - Pawnshop
	
		System.out.println("�g�L���\t|\t�Ȧ�ɶU\t|\t��Q�ɶU\t|\t�a�U����");
		System.out.println("----------------------------------------------------------------------------------------------");
		for (int l = 1; l <=12; l++) { // 1~12�Ӥ�
			System.out.print("��" + l +"�Ӥ�\t|");
			payBank1 = principle * Math.pow((1+rateBank),l);
			payPawnshop1 = principle *Math.pow((1+ratePawnshop),l);
			payYakuza1 = principle *Math.pow((1+rateYakuza),l);
			System.out.printf("     %,10.0f|     %,10.0f|     %,10.0f", payBank1, payPawnshop1, payYakuza1);
			System.out.print("\n");
		}
		
	}// end of main

}// end of class
