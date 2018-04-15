//import java.util.Collections;//.shuffle() //Ok, not to use the easy way
import java.util.Scanner;
public class BPoker {

	static int[] cardGen(int x) {
		int []cardGenR = new int [x];
		boolean []cardBpool = new boolean [52];
		
		for (int i =0; i < 52;i++) {
			cardBpool[i]=false;
		}
		
		for (int i = 0; i<cardGenR.length; i++) {
			A: while(true) {
				int j = (int)(Math.random()*52);
					if(cardBpool[j]==false) {
						cardGenR[i]=j;
						cardBpool[j]=true;
						break A;
					}// end of if loop
			}// end of core cardGen infinite while A loop
		}// end of gen 52? card loop
		
		return cardGenR;
	}// end of cardGen method
	
	static String [][] cardPatch( int person, int cards){
		String [][]totalHandsCards = new String [person][cards];
		int [] cardPatching = cardGen(person * cards);
		int count = 0;
		
		for (int i=0; i<cards;i++) {
			for(int j=0; j< person;j++) {
				totalHandsCards[j][i]=cardTrans(cardPatching[count]);
				count++;
			}
		}
		return totalHandsCards;
	}
	
	static void printCard(int person, int cards) {
		String [][]cardToPrint = cardPatch(person,cards);
		for(int i=0;i<person;i++) {
			System.out.print((i+1)+"player: ");
			for(int j=0;j<cards;j++) {
				System.out.print(cardToPrint[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
	
	static String color(int i) {
		String [] cR= {"±öªá","¤è¶ô","¬õ¤ß","¶Â®ç"};
		return cR [i];
	}
	
	static String number(int i) {
		String []nR = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		return nR[i];
	}
	
	static String cardTrans(int i) {
		String cardTransR = "";
		cardTransR += color(i/13);
		cardTransR += number(i%13);
		
		return cardTransR;
	}
	
	
	
	public static void main(String[] args) {
	
//	System.out.println(cardTrans(25)); //test card translate	
		
//	for( int n:	cardGen(52)) {
//		System.out.print(n +"|");
//	}			// test cardGen
	Scanner sc = new Scanner(System.in);                                                                                                                                                                                                                                                                                                                                                                                                   
	System.out.println("how many player?");
	int player = sc.nextInt();
	System.out.println("how many card per each player?");
	int cPP = sc.nextInt();
	sc.close();

	printCard(player,cPP);
	
		
		
	}

}
