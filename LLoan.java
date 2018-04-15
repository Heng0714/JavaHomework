
public class LLoan {
/* 錢不精以100000元分別向銀行、當鋪和地下錢莊借貸。若銀行的年利率為20%，
 當鋪月利率為10%和地下錢莊日利率為1%。以月為單位，計算一個月後至一年後每個月該歸還多少錢。*/
	
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
		
		System.out.printf("銀行月利率為%7.3f%%%n當鋪月利率為%7.3f%%%n地下錢莊月利率為%7.3f%%%n%n",rateBank*100,ratePawnshop*100,rateYakuza*100);

		//銀行借貸
		
		
		
		for (int i = 1; i<=12;i++) {
			payBank=100000*Math.pow((1+rateBank),i);
			System.out.printf("向銀行借貸%d個月後應償還的本利合為\t%,10.0f%n",i,payBank);
		}// end of for loop - bank
		
		//當鋪借貸
		System.out.print("\n");
		for (int j = 1; j<=12;j++) {
			payPawnshop=100000*Math.pow((1+ratePawnshop),j);
			System.out.printf("向當鋪借貸%d個月後應償還的本利合為\t%,10.0f%n",j,payPawnshop);
		}// end of for loop - Pawnshop
		
		//地下錢莊借貸
		System.out.print("\n");
		for (int k = 1; k<=12;k++) {
			payYakuza=100000*Math.pow((1+rateYakuza),k);
			System.out.printf("向地下錢莊%d個月後應償還的本利合為\t%,10.0f%n",k,payYakuza);
			System.out.print("\n");
		}// end of for loop - Pawnshop
	
		System.out.println("經過月數\t|\t銀行借貸\t|\t當鋪借貸\t|\t地下錢莊");
		System.out.println("----------------------------------------------------------------------------------------------");
		for (int l = 1; l <=12; l++) { // 1~12個月
			System.out.print("第" + l +"個月\t|");
			payBank1 = principle * Math.pow((1+rateBank),l);
			payPawnshop1 = principle *Math.pow((1+ratePawnshop),l);
			payYakuza1 = principle *Math.pow((1+rateYakuza),l);
			System.out.printf("     %,10.0f|     %,10.0f|     %,10.0f", payBank1, payPawnshop1, payYakuza1);
			System.out.print("\n");
		}
		
	}// end of main

}// end of class
