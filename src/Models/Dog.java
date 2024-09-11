package Models;

public class Dog {
	
	public String DogType;
	
	public int DogAge;
	
	public static int DogCounter = 0; // Initialize counter to keep track of how many dogs created
	
	public int ID;
	
	

	
	// Constructor that takes 2 params
	public Dog(String DogType, int DogAge) {
		this.DogType = DogType; // DogName param is assigned with DogName field string name
		this.DogAge = DogAge; // DogAge param is assigned with DogAge field integer
		
		// Increment this counter and assign it to ID for each new Dog instance created
		this.ID = ++DogCounter;
	}

	// Getter and setters
	
	// Get dog type
	public String getDogType() {
		return DogType;
	}

	
	// Set dog type
	public void setDogType(String dogType) {
		DogType = dogType;
	}

	// Get dog age
	public int getDogAge() {
		return DogAge;
	}

	// Set dog age
	public void setDogAge(int dogAge) {
		DogAge = dogAge;
	}

	// toString Method
	@Override
	public String toString() {
		return "This Dog type is" + DogType + " and is " + DogAge + " years old, in dog years!\n This Dog ID: " + ID + "\n";
	}
	
	
	// Display the message in string 
	public void displayDogInfo() {
		System.out.print(this.toString()); // Referring to this Dog class's toString method as a method to output in terminal
	}
		

}
