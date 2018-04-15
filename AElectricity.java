
public class AElectricity {

	public static void main(String[] args) {
		/* 1.	選擇性敘述的練習-Electricity
		輸入何種用電和度數，計算出需繳之電費。
		電力公司使用累計方式來計算電費，分工業用電及家庭用電。
                   	   	家庭用電        工業用電
   240度(含)以下			0.15元			0.45元
   240~540(含)度   		0.25元			0.45元
   540度以上        			0.45元			0.45元  */

		
		double usage = 500;
		String classP ="家庭用電";
		// inputs ends here
		double indusrialPayGrade = 0.45;
		double homePayGrade1 = 0.15;
		double homePayGrade2 = 0.25;
		double homePayGrade3 = 0.45;
		
		double cutOffPoint1 = 240;
		double cutOffPoint2 = 540;
		// 電價表格定義表 ends here
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
		if (classP.equals("工業用電")) { //start from test if industrail
			payRequest = usage * indusrialPayGrade;
		} 
		else {payRequest = 	(usageGrade1 * homePayGrade1)+ // no error test feature, 除了工業用戶外都視為家庭用戶，待改善
							(usageGrade2 * homePayGrade2)+
							(usageGrade3 * homePayGrade3);
			
		}

		System.out.printf("尊敬的%4s用戶，請支付電費%8.0f元,G1:%5.1f度,G2:%5.1f度,G3:%5.1f度" ,classP,payRequest,usageGrade1,usageGrade2,usageGrade3);
	}

}
