
public class KInterest {

	/* 11.	迴圈敘述的練習-Interest
			錢精打以10%單利投資100000元，郝細算則以5%複利投資100000元。計算多少年後郝細算的投資可以超過錢精打，並將此時兩人錢數印出。(27年後)
			提示：單利公式：P(1+r*n)    複利公式：P(1+r)n
			P：本金，r：利率，n：多少年 */

	
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
	System.out.printf("郝細算的投資在%d年後會超越錢精打%n此時錢精打的投資餘額是%,8.0f，郝細算的投資餘額是%,8.0f",n,simpleInterestResult,compountInterestResult);
		

	}

}
