
public class Bsales {

	public static void main(String[] args) {
		int [][] sales= {{33,32,56,45,33},{77,33,68,45,23},{43,55,43,67,55}};
		
		String[] productName = {"Product A","Product B","Product C","Product D","Product E"};
		String[] salesmanName = {"Salesman 1","Salesman 2","Salesman 3"};
		
		
		int productASUM = 0;
		int productBSUM = 0;
		int productCSUM = 0;
		int productDSUM = 0;
		int productESUM = 0;
		int salesmanASUM = 0;
		int salesmanBSUM = 0;
		int salesmanCSUM = 0;
		
		int tp=0;
		int bestSaleProduct = 0;
		
		int tm = 0;
		int bestSalePerformance = 0;
		
		String tBSP= "___"; 
		String bestSellProductName = "___";
		
		String tBSM= "___";
		String bestSalesman = "___";	
		
		for (int i = 0; i<sales.length;i++) {
			productASUM += sales[i][0];
		}
		for (int i = 0; i<sales.length;i++) {
			productBSUM += sales[i][1];
		}
		for (int i = 0; i<sales.length;i++) {
			productCSUM += sales[i][2];
		}
		for (int i = 0; i<sales.length;i++) {
			productDSUM += sales[i][3];
		}
		for (int i = 0; i<sales.length;i++) {
			productESUM += sales[i][4];
		}
//--------------------------------------------------------		

			for (int i=0; i <sales[0].length;i++) {
				for (int j =0; j <sales.length; j++) {
					tp += sales[j][i];
					tBSP = productName[j];
				}
				
				if (bestSaleProduct < tp) {
					bestSaleProduct = tp;
					bestSellProductName = tBSP;
					}
				tp = 0;
			
				
			}


// --------------------------------------------------------------------		
		for (int i= 0;i < 5;i++) {
			salesmanASUM += sales[0][i];
		}
		for (int i= 0;i < 5;i++) {
			salesmanBSUM += sales[1][i];
		}
		for (int i= 0;i < 5;i++) {
			salesmanCSUM += sales[2][i];
		}

//----------------------------------------------------		
		for (int i = 0; i <sales.length; i++) {
			for (int j=0; j <sales[i].length;j++) {
				tm += sales[i][j];
				tBSM = salesmanName[i];
				}
				if (bestSalePerformance < tm) {
					bestSalePerformance = tm;
					bestSalesman = tBSM;
					}
				tm = 0;
			
		}
		
	System.out.println("the sum of product A sales is: "+ productASUM);	
	System.out.println("the sum of product B sales is: "+ productBSUM);
	System.out.println("the sum of product C sales is: "+ productCSUM);
	System.out.println("the sum of product D sales is: "+ productDSUM);
	System.out.println("the sum of product E sales is: "+ productESUM);
	System.out.println("Salesman A performance: "+salesmanASUM);
	System.out.println("Salesman B performance: "+salesmanBSUM);
	System.out.println("Salesman C performance: "+salesmanCSUM);
	System.out.printf("The best selling product is %s, which sells %d units \n",bestSellProductName,bestSaleProduct);
	System.out.printf("The best salesman is %s, who sells %d unit of product(mix type)\n",bestSalesman,bestSalePerformance);
	
	
	}// end of main
	
}// end of class
