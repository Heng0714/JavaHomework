import java.util.*;
public class CIDGenerator {
/*3.	��X���m��-IDGenerator
��J�a�ϩM�ʧO�A�g�ѶüƲ��ͤ@�Ө������r���C*/
	static String idResult (String []s) {
		String idR ="";
		for (int i=0; i<s.length;i++) {
			idR += s[i];
		}
		return idR;
	}
	
	static int sTi (String s) {
		return Integer.parseInt(s);
	}
	
	static String iTs (int j) {
		return String.valueOf(j);
	}
	
	static int ran09() {
		return (int)(Math.random()*10);
	}
	
	static int pOBCodeVert (int [] r, int i) {
		int pOBCodeVertReturn = 0;
		int pOBCodeTmp = 0;
		pOBCodeTmp = r[i];
		pOBCodeVertReturn = (pOBCodeTmp%10)*9+(pOBCodeTmp/10);
		
		return pOBCodeVertReturn;
	}
	
	public static void main(String[] args) {
		String[]pOB = {"�x�_��","�x����","�򶩥�","�x�n��","������","�x�_��","�y����","��鿤","�Ÿq��","�s�˿�",
						"�]�߿�",	"�x����",	"�n�뿤","���ƿ�","�s�˥�","���L��","�Ÿq��","�x�n��","������","�̪F��",
						"�Ὤ��",	"�x�F��","������","���","�����s","�s����"};
		
				
		String[]pOBLet = {"A","B","C","D","E","F","G","H","I","J",
							"K","L","M","N","O","P","Q","R","S","T",
							"U","V","W","X","Y","Z"};
		
		int []pOBCode = {10,11,12,13,14,15,16,17,34,18,
							19,20,21,22,35,23,24,25,26,27,
							28,29,32,30,31,33};
		
//		for (int i=0; i <26; i++) {
//			System.out.println(pOBLet[i]+ "|" + pOBCode[i] + "|"+pOB[i]);
//		}                     // these three lines to check input array
		
		String[] generatedID = new String[10];
		int checkValue =0;
		int countMatrix = 0;
		int tMP = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("type in place of birth");
		String pOBin = sc.next();
		System.out.println("Please input gender. Male = 1, Female = 2");
		String gender = sc.next();
		sc.close();
		
		A :for (countMatrix = 0; countMatrix < 26; countMatrix++) {
			if(pOBin.equals(pOB[countMatrix])) {
				break A;
			}
		} // end of A
//		System.out.println (countMatrix+"|"+gender); // this line was used to test scanner and matrix count
		
		
		generatedID[0]=pOBLet[countMatrix];
		generatedID[1]=gender;   //matrix to string required
		
		
		checkValue += pOBCodeVert(pOBCode,countMatrix);
		checkValue += (sTi(gender)*8);
	
		for (int i =2; i<=8;i++) {
			tMP = ran09();
			checkValue += tMP*(9-i);
			generatedID[i] = iTs(tMP);
		}
		generatedID[9] = iTs(10-(checkValue%10)%10);
		
//		for (String s:generatedID) {
//			System.out.print(s);
//		}								// for each loop to print generated id, not a string
		
		System.out.println(idResult(generatedID));
		
		
		
	}// end of main

}// end of class
