// PetShop.java

public class PetShop {

	public static void main(String[] args) {

// Create a Pet object called pet1

	Pet pet1 = new Pet();
        
// Set pet1's name to "Buddy"

	pet1.name = "Buddy";

// Set pet1's age to 3

    pet1.age = 3;

// Create a second Pet object called pet2
	
	Pet pet2 = new Pet();
        
// Set pet2's name to "Luna"

	pet2.name = "Luna";

// Set pet2's age to 5

	pet2.age = 5;	
        
// Call speak() on pet1
	
	pet1.speak();
        
// Call speak() on pet2
	
	pet2.speak();
    }
}

