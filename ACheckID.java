import java.util.Scanner;
public class ACheckID {
/* 1.	��X���m��-CheckID
�g�@���boolean isID (String id)�ΨӧP�_id�O�_�����T�������r���C

�T�{�@�ը����Ҹ��X�O�_�X�k?? 
1.�ثe�����إ��ꨭ���Ҧr���@�@���Q�X�A�]�A�_���@�Ӥj�g���^��r���P���򪺤E�Ӫ��ԧB�Ʀr�C
�@�@�@(1)�^��N���H�U���ഫ���Ʀr 
�@�@�@A=10 �x�_���@�@�@J=18 �s�˿��@�@�@S=26 ������ 
�@�@�@B=11 �x�����@�@�@K=19 �]�߿��@�@�@T=27 �̪F�� 
�@�@�@C=12 �򶩥��@�@�@L=20 �x�����@�@�@U=28 �Ὤ�� 
�@�@�@D=13 �x�n���@�@�@M=21 �n�뿤�@�@�@V=29 �x�F�� 
�@�@�@E=14 �������@�@�@N=22 ���ƿ��@�@* W=32 ������ 
�@�@�@F=15 �x�_���@�@* O=35 �s�˥��@�@�@X=30 ��� 
�@�@�@G=16 �y�����@�@�@P=23 ���L���@�@�@Y=31 �����s 
�@�@�@H=17 ��鿤�@�@�@Q=24 �Ÿq���@�@* Z=33 �s���� 
�@�@* I=34 �Ÿq���@�@�@R=25 �x�n���@
�@�@(2)�A�ӭ���Ʀr�h�O���ӰϤ��ʧO�A�k�ʬ�1�B�k�ʬ�2�A
2.�W�h�����G
�@�@�@(1)�^���ন���Ʀr, �Ӧ�ƭ����A�[�W�Q��� 
�@�@�@(2)�U�Ʀr�q�k�쥪�̦������B���B���B���D�D�D�D�� 
�@�@�@(3)�D�X(1),(2)���M 
�@�@�@(4)�D�X(3)��10�ᤧ�l��,��10��Ӿl��,���G�N�O�ˬd�X,�Y�l�Ƭ�0 
�@�@�@�@ �ˬd�X�N�O0  */
	static boolean formatTest(String id) {
		boolean formatTestResult = false;
		
		formatTestResult = id.matches("[A-Z][1-2][0-9]{8}");
		
		
		return formatTestResult;
			
	}
	static int pOB(char lPOB) {
		int pOBReturn = 0;
		int pOBTmp = 0;
		switch(lPOB) {
		case 'A': pOBTmp = 10;break;	
		case 'B': pOBTmp = 11;break;
		case 'C': pOBTmp = 12;break;
		case 'D': pOBTmp = 13;break;
		case 'E': pOBTmp = 14;break;
		case 'F': pOBTmp = 15;break;
		case 'G': pOBTmp = 16;break;
		case 'H': pOBTmp = 17;break;
		case 'I': pOBTmp = 34;break;
		case 'J': pOBTmp = 18;break;
		case 'K': pOBTmp = 19;break;
		case 'L': pOBTmp = 20;break;
		case 'M': pOBTmp = 21;break;
		case 'N': pOBTmp = 22;break;
		case 'O': pOBTmp = 35;break;
		case 'P': pOBTmp = 23;break;
		case 'Q': pOBTmp = 24;break;
		case 'R': pOBTmp = 25;break;
		case 'S': pOBTmp = 26;break;
		case 'T': pOBTmp = 27;break;
		case 'U': pOBTmp = 28;break;
		case 'V': pOBTmp = 29;break;
		case 'W': pOBTmp = 32;break;
		case 'X': pOBTmp = 30;break;
		case 'Y': pOBTmp = 31;break;
		case 'Z': pOBTmp = 33;break;
		}
		
		pOBReturn = (pOBTmp%10)*9 + (pOBTmp/10);
		
		return pOBReturn;
	}
	
	
	static boolean isID(String id) { 
		
		boolean idTestResult = false;
		boolean fT = formatTest(id);
		int testNumber = 0;
		int remainderTest = 0;
		if (fT = true) {
			for (int i=1;i<=8;i++) {
				testNumber += Character.getNumericValue(id.charAt(i))*(9-i);
			}
			testNumber+= pOB(id.charAt(0));
			remainderTest = (10-(testNumber%10)%10);
			if  (remainderTest == (Character.getNumericValue(id.charAt(9)))){
				idTestResult = true;
			}
		}
		else {
			idTestResult = false;
		}
		
		
//		return testNumber;
		return idTestResult;
	}
	

	

	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the ID number to be tested");
		String idTest = sc.next();
		sc.close();
//		System.out.println("The Id Number be tested is: "+ idTest);
//		System.out.println("This ID is " + isID(idTest));
		
//			System.out.println(formatTest(idTest));
			System.out.println(isID(idTest));

		
	}

}
