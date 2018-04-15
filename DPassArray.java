
public class DPassArray {
	static double allAvg(int r[][]) {
		double returnAllAvg = 0;
		double raySum = 0;
		double lengthCal = 0;
		
			for (int i = 0; i < r.length;i++) {
				for (int j = 0; j < r[i].length;j++) {
					lengthCal++;
				}
			}
			
			for (int i = 0; i < r.length;i++) {
				for (int j = 0; j < r[i].length;j++) {
					raySum += r[i][j];
				}
			}
			
			returnAllAvg = raySum / lengthCal;
		
		return returnAllAvg;
	}
	
	static int rayMax(int r[][]) {
		int returnMax = -999999;
		
		for (int i = 0; i < r.length;i++) {
			for (int j = 0; j < r[i].length;j++) {
				if (returnMax < r[i][j]) {
					returnMax = r[i][j];
				}
			}
		}
		
		return returnMax;
	}
	
	static int rayMin(int r[][]) {
		int returnMin = 999999;
		
		for (int i = 0; i < r.length;i++) {
			for (int j = 0; j < r[i].length;j++) {
				if (returnMin > r[i][j]) {
					returnMin = r[i][j];
				}
			}
		}
		
		return returnMin;
	}
	
	static double rowAvg(int r[][],int x) {
		double columnCount = 0;
		double rowSum = 0;
		double rowAvg = 0;
		for (int j = 0; j <r[x-1].length;j++) {
			columnCount++;
		}
		for (int j = 0; j <r[x-1].length;j++) {
			rowSum += r[x-1][j];
		}
		
		rowAvg = rowSum / columnCount;
		
		return rowAvg;
	}
	
	
	
	public static void main(String[] args) {
		int[][] ray = {	{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}};
						
		System.out.println("Array average = " + allAvg(ray));
		System.out.println("Array Max = " + rayMax(ray));
		System.out.println("Array Min = " + rayMin(ray));
		System.out.println("Array row 1 avg = " + rowAvg(ray,1));
		System.out.println("Array row 2 avg = " + rowAvg(ray,2));
		System.out.println("Array row 3 avg = " + rowAvg(ray,3));
		
	}

}
