package Chapter11;

public class Ex2 {

	public static void main(String[] args) {
		
        double side1 = 6; 
        double side2 = 4; 
        double hypotenuse;         

        
        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        System.out.println("The length of the hypotenuse is: " + hypotenuse);
	}

}
