
public class AMaxMin {

	public static void main(String[] args) {
	int[] data ={5,7,9,3,88,74,54,1,999,2};
	
	int max = 0;
	int min = 9999999;
	for (int i = 0;i<10;i++) {
		if(max < data[i]) {
			max =data [i];
		}
	}
	
	for (int i = 0;i<10;i++) {
		if(min > data[i]) {
			min =data [i];
		}
	}
	
	
	System.out.println("the max value for data arrat is  "+max);
	System.out.println("the min value for data arrat is  "+min);
	
	
	
	}

}
