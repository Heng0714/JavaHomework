
public class ERefund {

	public static void main(String[] args) {
	/* 5.	選擇性敘述的練習-Refund
			輸入在某商店購物應付金額與實付金額。
			實付金額小於應付金額，則印出”金額不足”。
			實付金額等於應付金額，則印出”不必找錢”。
			實付金額大於應付金額，則輸出找回金額最少的鈔票數和錢幣數。
			假設幣值只有1000, 500, 100元紙鈔和50, 10, 5, 1元硬幣。
			說明：若買了132元的商品，付1000元，應找回一張500元，
			三張100元，一個50元硬幣，一個10元硬幣，一個5元硬幣和三個1元硬幣。 */

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
			System.out.println("金額不足");
		}else {
			if(enough == true && eqeq == true) {
				System.out.println("不必找錢");
			}else {
				System.out.printf("找您1000元鈔票%d張，找您500元鈔票%d張，100元鈔票%d張，50元硬幣%d個，10元硬幣%d個，5元硬幣%d個"
						+ "，1元硬幣%d個，請查收", tN,fHN,oHN,fftyC,tC,fC,oC );
			}
			
			
		}
		
	}

}
