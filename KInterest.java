
public class KInterest {

	/* 11.	�j��ԭz���m��-Interest
			���르�H10%��Q���100000���A�q�Ӻ�h�H5%�ƧQ���100000���C�p��h�֦~��q�Ӻ⪺���i�H�W�L���르�A�ñN���ɨ�H���ƦL�X�C(27�~��)
			���ܡG��Q�����GP(1+r*n)    �ƧQ�����GP(1+r)n
			P�G�����Ar�G�Q�v�An�G�h�֦~ */

	
	public static void main(String[] args) {
	double simpleInterestResult = 0;
	double compountInterestResult = 0;
	int n = 1;
		while (true) {
			simpleInterestResult = 100000*(1+0.1*n);
			compountInterestResult = 100000*Math.pow((1+0.05),n);
			if (compountInterestResult > simpleInterestResult ) break;
			n++;
			} // end of while loop
	System.out.printf("�q�Ӻ⪺���b%d�~��|�W�V���르%n���ɿ��르�����l�B�O%,8.0f�A�q�Ӻ⪺���l�B�O%,8.0f",n,simpleInterestResult,compountInterestResult);
		

	}

}
