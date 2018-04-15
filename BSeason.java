
public class BSeason {

	public static void main(String[] args) {
		/* 	2.	選擇性敘述的練習-Season
				輸入月份1~12月，利用switch判斷相對應的季節春、夏、秋、冬並印出。若不在此範圍則印出”輸入錯誤”。 */

		
		int monthInput = 0; // initial value setting
		monthInput = 3; // month input, should from elsewere.
		// End of input
		String seasonOutput;
		String spring = "春 - 忽如一夜春風來，千束萬束白花開";
		String summer = "夏- 楊萬里泉眼無聲惜細流，樹陰照水愛晴柔。小荷才露尖尖角，早有蜻蜓立上頭";
		String autumn = "秋- 遠上寒山石徑斜，白雲深處有人家。 停車坐愛楓林晚，霜葉紅於二月花";
		String winter = "冬- 千山鳥飛絕，萬徑人蹤滅。孤舟蓑笠翁，獨釣寒江雪";
		switch (monthInput) {
		case 1: seasonOutput = winter;break;
		case 2: seasonOutput = winter;break;
		case 3: seasonOutput = spring;break;
		case 4: seasonOutput = spring;break;
		case 5: seasonOutput = spring;break;
		case 6: seasonOutput = summer;break;
		case 7: seasonOutput = summer;break;
		case 8: seasonOutput = summer;break;
		case 9: seasonOutput = autumn;break;
		case 10: seasonOutput = autumn;break;
		case 11: seasonOutput = autumn;break;
		case 12: seasonOutput = winter;break;
		default: seasonOutput = "輸入錯誤";
		}
		System.out.println(seasonOutput);

	}

}
