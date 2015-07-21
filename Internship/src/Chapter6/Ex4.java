package Chapter6;

public class Ex4 {

	public static void main(String[] args) {
		for (int i = 2; i <= 14; i++){
			for (int n = 1; n <= 4; n++){
				
				switch (i){
				case 2: System.out.print("2 "); break;
				case 3: System.out.print("3 "); break;
				case 4: System.out.print("4 "); break;
				case 5: System.out.print("5 "); break;
				case 6: System.out.print("6 "); break;
				case 7: System.out.print("7 "); break;
				case 8: System.out.print("8 "); break;
				case 9: System.out.print("9 "); break;
				case 10: System.out.print("10 "); break;
				case 11: System.out.print("J "); break;
				case 12: System.out.print("D "); break;
				case 13: System.out.print("K "); break;
				case 14: System.out.print("A "); break;
				
				}
				
				switch (n){
				case 1: System.out.println("Спатия"); break;
				case 2: System.out.println("Каро"); break;
				case 3: System.out.println("Купа"); break;
				case 4: System.out.println("Пика"); break;
				}
				System.out.println();
				
				
			}
			
			
		}
	}

}
