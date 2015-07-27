package Chapter20;

public class Ex5_Test {

	public static void main(String[] args) {
		Ex5_Animal[] animals = new Ex5_Animal[5];
			animals[0]	= new Ex5_Frog("Jabcho", 2, "Male");
			animals[1]	= new Ex5_Cat("Leon", 3, "Male");
			animals[2]	= new Ex5_Dog("Sara", 4, "Female");
			animals[3]	= new Ex5_Kitten("Kitty", 1);
			animals[4]	= new Ex5_Tomcat("Tommy", 1);
			
			
			animals[0].makeSound();
			animals[1].makeSound();
			animals[2].makeSound();
			animals[3].makeSound();
			animals[4].makeSound();
			
			Ex5_Cat.averageAges();
			Ex5_Dog.averageAges();
			Ex5_Frog.averageAges();

			
			
			
	}
	
	

}
