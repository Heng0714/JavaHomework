
public class CRain {


	
	static void year (float r[][][], int x) {
		double sumRainYear = 0;
		for (int j = 0;j< r[x-1].length;j++ ) {
			for(int k = 0; k < r[x-1][0].length;k++) {
				sumRainYear += r[x-1][j][k];
			}
			
		}
		System.out.println(sumRainYear);
	}
	
	static void season (float r[][][], int x) {
		double sumRainSeason = 0;
		for (int i = 0;i< r.length;i++ ) {
			for(int k = 0; k < r[0][0].length;k++) {
				sumRainSeason += r[i][x-1][k];
			}
			
		}
		System.out.println(sumRainSeason);
	}
	
	static void month (float r[][][], int x, int y) {
		double sumRainMonth = 0;
		for (int i = 0;i< r.length;i++ ) {		
				sumRainMonth += r[i][x-1][y-1];		
		}
		System.out.println(sumRainMonth);
	}
	
	
	public static void main(String[] args) {
		float [][][]rain = {{{75,140,297},{71,67,325},{765,1078,457},{134,145,47}},
					{{76,141,298},{72,68,326},{766,1079,458},{135,146,48}},
					{{77,142,299},{73,69,327},{767,1080,459},{136,147,49}},
					{{78,143,300},{74,70,328},{768,1081,460},{137,148,50}},
					{{79,144,301},{75,71,329},{769,1082,461},{138,149,51}}};
	
		String proT = args[0];

		if (proT.equals("all") ) {
			double sumRainAll = 0;
						for( int i =0; i<rain.length;i++) {
							for (int j=0; j<rain[i].length;j++) {
								for(int k=0; k<rain[i][j].length;k++) {
									sumRainAll += rain[i][j][k];
								}
							}
						}
				System.out.println(sumRainAll);		
					
		}
		else if(proT.equals("year")) {
			int tmpMod = Integer.parseInt(args[1]);
//			System.out.println(proT + tmpMod);
			switch(tmpMod) {
			case 1 :year(rain,1);
					break;
			case 2 :year(rain,2);
					break;
			case 3 :year(rain,3);
					break;
			case 4 :year(rain,4);
					break;
			case 5 :year(rain,5);
					break;
			default: 
				System.out.println("i don't know what are you talking about: year");
			}
		}
		else if(proT.equals("season")) {
			int tmpMod = Integer.parseInt(args[1]);
			switch(tmpMod) {
			case 1 :season(rain,1);
					break;
			case 2 :season(rain,2);
					break;
			case 3 :season(rain,3);
					break;
			case 4 :season(rain,4);
					break;
			
			default: 
				System.out.println("i don't know what are you talking about: season");
			}
		}
		else if(proT.equals("month")) {
			int tmpMod = Integer.parseInt(args[1]);
			switch(tmpMod) {
			case 1 :month(rain,1,1);
					break;
			case 2 :month(rain,1,2);
					break;
			case 3 :month(rain,1,3);
					break;
			case 4 :month(rain,2,1);
					break;
			case 5 :month(rain,2,2);
					break;
			case 6 :month(rain,2,3);
					break;
			case 7 :month(rain,3,1);
					break;
			case 8 :month(rain,3,2);
					break;
			case 9 :month(rain,3,3);
					break;
			case 10 :month(rain,4,1);
					break;
			case 11 :month(rain,4,2);
					break;
			case 12 :month(rain,4,3);
					break;
			default: 
				System.out.println("i don't know what are you talking about: month");
			}
		}
		else {
			System.out.println("you input wrong index");
		}
	
		
	}// end of main



}// end of class
