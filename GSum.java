
public class GSum {

	/* 7.	���j��ƪ��m��-Sum
			�g�@���j���int sum (int n)�Ψӭp��2+4+6�K+2n���ȡC*/

	static int recurisiveSum (int n) {
		 if (n == 1) {
	            return 2;
	        }
	        return (2*n) + recurisiveSum(n - 1);



	
	
	}
	
	public static void main(String[] args) {
		System.out.println(recurisiveSum(10));

	}

}
