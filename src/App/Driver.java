package App;
import Models.Dog;

public class Driver {

	public static void main(String[] args) {
		
		// New Dog object with myDog initialized
		Dog myDog = new Dog("German Shepard", 5);
		
		
		// Your Dog object
		// 2 year old bulldog that is declared as yourDog
		Dog yourDog = new Dog("Bulldog", 2);
		
		myDog.displayDogInfo();
		
		
		yourDog.displayDogInfo();
		
		equal(myDog,yourDog);
		
		
		explainQ9();
	}
	
	
	// A Id should always be unique and never the same.... this breaks PK integrity. For sake of HW, I'll print out "Same Dog" or "Not the Same Dog"
	public static void equal(Dog dog1, Dog dog2) {
		// Those dog params have access to Dog object, allows me to step into ID
		if (dog1.ID == dog2.ID ) {
			System.out.print("Same Dog!");
		} else {
			System.out.print("Not the Same Dog!");
		}
	}
	
	public static void explainQ9() {
		System.out.print("\nUnxoxing happens when Double X and Y are transformed into double primitives for the add operation.\nAfter X+Y, boxing happens when the double results is tranasformed into Double for Z storage. ");
	}

}
