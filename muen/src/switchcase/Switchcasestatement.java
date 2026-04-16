package switchcase;

import java.util.Scanner;

public class Switchcasestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int today = 4;
		switch(today) {
		case 1:
        System.out.println("today is monday "); 
        break;
		case 2:System.out.println("today is saturday"); 
		break;
		case 3: System.out. println("today is thursday"); 
		break;
		case 4: System. out.println("today is sunday");
		Scanner input = new Scanner (System.in);
		
		System.out.println("**************Zaad sevice Telesom*************");
		System.out.println("1. itus hadhaagaga");
		System.out.println("2. lacag dirid");
		System.out.println("3. lacag la bixid");
		System.out.println("4. ku iibso");
		System.out.println("5. lasoco dhaqdhaqaaqa");
		System.out.println("Dooro service (1-5)");
		int choice = input .nextInt();
		switch(choice) {
		case 1:
			System.out.println("hadhaagagu waa 100$");
			break;
		case 2:
			System.out.println("lacag dirid");
			System.out.println("fadlan gali numberka aad lacagta u dirayso");
			break;
		case 3:
			System.out.println("lacag la bixid");
			System.out.println("fadlan gali lacgta la baxayso");
			break;
		case 4:
			System.out.println("fadlan gali numberka ku iibsada");
			System.out.println("gali lacgta aad ku iibsanayso");
		break;
		case 5:
			System.out.println("dhaqdhaqaaqaga wa lagu guulaysty");
			break;
			default:
				System.out.println("waxba ma aadan dooran ka bax");
				input.close();
		}
		
	}
}
}
