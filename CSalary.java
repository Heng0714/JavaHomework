
public class CSalary {

	public static void main(String[] args) {
		/* 3.	��ܩʱԭz���m��-Salary
				��J�K�Q�ө��uŪ�ͪ��u�@�ɼơA�íp����~��C
				60�p�ɥH���A���~120���C
				61~80�p�ɡA�H���~1.25���p��C
				81�p�ɥH�W�A�H���~1.5���p��C
				�����G�~��H�֭p�覡�p��C�Y�u�ɬ�90�p�ɡA�h�~�ꬰ
				60*120 + 20*120*1.25 + 10*120*1.5���C */
		
		String ename; // not necessary
		double workHour = 0; //define variable
		double standRate = 120; // define rate
		double multiplier2 = 1.25;
		double multiplier3 = 1.5;
		double payResult = 0; //initial value
		double cutOffHour1 = 60;
		double cutOffHour2 = 80;
		
		ename = "���p��";                  
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
		
		System.out.printf("���u%s�A�A���몺���~��%5.0f���A�P�§A���I�X",ename, payResult);
		
		
	}

}
