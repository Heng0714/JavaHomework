import java.util.Scanner;
public class HPassword {
	/* 8.	迴圏的練習-Password
			出現”請輸入密碼”的提示，使用者有最多三次輸入的機會。
			若輸入正確，則印出”密碼輸入正確，歡迎使用本系統！”。
			若輸入不正確，再次出現”請輸入密碼”的提示。
			若三次輸入不正確，則印出”密碼輸入超過三次！”，並結束程式的執行。*/

	
	
	public static void main(String[] args) {
		int rightPassword = 859181;
		int count = 1;
		boolean passTest = false;

		Scanner scanner = new Scanner(System.in);
		while (count <= 3) {
			System.out.println("請輸入密碼");	
			int input = scanner.nextInt();
				if (input == rightPassword) {
					passTest = true;
					break;
					} // end of if clause
			count++;
		} // end of while loop
	
		if (passTest == false) {
			System.out.println("密碼輸入超過三次!");
		}else {
			System.out.println("密碼輸入正確，歡迎使用本系統！");
		}
		scanner.close();

	} // end of main

} // end of class
