
public class AElectricity {

	public static void main(String[] args) {
		/* 1.	��ܩʱԭz���m��-Electricity
		��J��إιq�M�׼ơA�p��X��ú���q�O�C
		�q�O���q�ϥβ֭p�覡�ӭp��q�O�A���u�~�ιq�ήa�x�ιq�C
                   	   	�a�x�ιq        �u�~�ιq
   240��(�t)�H�U			0.15��			0.45��
   240~540(�t)��   		0.25��			0.45��
   540�ץH�W        			0.45��			0.45��  */

		
		double usage = 500;
		String classP ="�a�x�ιq";
		// inputs ends here
		double indusrialPayGrade = 0.45;
		double homePayGrade1 = 0.15;
		double homePayGrade2 = 0.25;
		double homePayGrade3 = 0.45;
		
		double cutOffPoint1 = 240;
		double cutOffPoint2 = 540;
		// �q�����w�q�� ends here
		double payRequest = 0;
		double usageGrade1 = 0;
		double usageGrade2 = 0;
		double usageGrade3 = 0;
		// divide usage into 3 part
		
		// usage judgement hereunder
		if (usage <=cutOffPoint1) {   // <=240kwh
			usageGrade1 = usage;
			usageGrade2 = 0;
			usageGrade3 = 0;
		}else {				// <=540kwh
			if (usage <= cutOffPoint2) {
				usageGrade1 = cutOffPoint1;
				usageGrade2 = (usage-cutOffPoint1);
				usageGrade3 = 0;
			}else {
				usageGrade1 = cutOffPoint1;
				usageGrade2 = cutOffPoint2 - cutOffPoint1;
				usageGrade3 = usage - cutOffPoint2;
			}
		}
		
		// class judgement
		if (classP.equals("�u�~�ιq")) { //start from test if industrail
			payRequest = usage * indusrialPayGrade;
		} 
		else {payRequest = 	(usageGrade1 * homePayGrade1)+ // no error test feature, ���F�u�~�Τ�~�������a�x�Τ�A�ݧﵽ
							(usageGrade2 * homePayGrade2)+
							(usageGrade3 * homePayGrade3);
			
		}

		System.out.printf("�L�q��%4s�Τ�A�Ф�I�q�O%8.0f��,G1:%5.1f��,G2:%5.1f��,G3:%5.1f��" ,classP,payRequest,usageGrade1,usageGrade2,usageGrade3);
	}

}
