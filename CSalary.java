
public class CSalary {

	public static void main(String[] args) {
		/* 3.	選擇性敘述的練習-Salary
				輸入便利商店工讀生的工作時數，並計算其薪資。
				60小時以內，時薪120元。
				61~80小時，以時薪1.25倍計算。
				81小時以上，以時薪1.5倍計算。
				說明：薪資以累計方式計算。若工時為90小時，則薪資為
				60*120 + 20*120*1.25 + 10*120*1.5元。 */
		
		String ename; // not necessary
		double workHour = 0; //define variable
		double standRate = 120; // define rate
		double multiplier2 = 1.25;
		double multiplier3 = 1.5;
		double payResult = 0; //initial value
		double cutOffHour1 = 60;
		double cutOffHour2 = 80;
		
		ename = "王小明";                  
		workHour = 90;		// input
		
		if (workHour <= cutOffHour1) {
			payResult = workHour * standRate;
		}else {
			if (workHour <= cutOffHour2) {
				payResult = (cutOffHour1 * standRate) +((workHour - cutOffHour1)* standRate * multiplier2);
			}else {
				payResult = (cutOffHour1 * standRate) + ((cutOffHour2 - cutOffHour1 )* standRate * multiplier2) + ((workHour - cutOffHour2)* standRate * multiplier3);
			}
		}
		
		System.out.printf("員工%s，你本月的月薪為%5.0f元，感謝你的付出",ename, payResult);
		
		
	}

}
