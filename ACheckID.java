import java.util.Scanner;
public class ACheckID {
/* 1.	綜合的練習-CheckID
寫一函數boolean isID (String id)用來判斷id是否為正確身份証字號。

確認一組身分證號碼是否合法?? 
1.目前的中華民國身分證字號一共有十碼，包括起首一個大寫的英文字母與接續的九個阿拉伯數字。
　　　(1)英文代號以下表轉換成數字 
　　　A=10 台北市　　　J=18 新竹縣　　　S=26 高雄縣 
　　　B=11 台中市　　　K=19 苗栗縣　　　T=27 屏東縣 
　　　C=12 基隆市　　　L=20 台中縣　　　U=28 花蓮縣 
　　　D=13 台南市　　　M=21 南投縣　　　V=29 台東縣 
　　　E=14 高雄市　　　N=22 彰化縣　　* W=32 金門縣 
　　　F=15 台北縣　　* O=35 新竹市　　　X=30 澎湖縣 
　　　G=16 宜蘭縣　　　P=23 雲林縣　　　Y=31 陽明山 
　　　H=17 桃園縣　　　Q=24 嘉義縣　　* Z=33 連江縣 
　　* I=34 嘉義市　　　R=25 台南縣　
　　(2)，而首位數字則是拿來區分性別，男性為1、女性為2，
2.規則說明：
　　　(1)英文轉成的數字, 個位數乘９再加上十位數 
　　　(2)各數字從右到左依次乘１、２、３、４．．．．８ 
　　　(3)求出(1),(2)之和 
　　　(4)求出(3)除10後之餘數,用10減該餘數,結果就是檢查碼,若餘數為0 
　　　　 檢查碼就是0  */
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
