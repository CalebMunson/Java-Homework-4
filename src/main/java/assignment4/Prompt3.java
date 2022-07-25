package assignment4;

//Prompt 3: Write a custom exception and throw it using throw keyword and throws.

//This code contains several classes for storing data of animals. 
//It has an animal class, an animal list class, and a custom exception AnimalNotFoundException.
//Both main and animalList throw this exception.
//This exception occurs when an animal is searched for and not found in the list.
//In this specific example, there are 2 animals added to the list, and a third is searched for but not found.
//The custom exception class can be found at line 63, and it is used in lines 14 and 34

public class Prompt3 {
	
	public static void main(String[] args) throws AnimalNotFoundException {
		animal a = new animal("dog", "bark", 5);
		animal b = new animal("cat", "meow", 7);
		
		animalList list = new animalList();
		
		list.add(a); //adds the dog to the list
		list.add(b); //adds the cat to the list
		
		list.printList();
		
		list.searchList("Hamster"); //This animal is not in the list
	}
}

class animalList {
	int size = 20;
	animal[] nameList = new animal[size];
	int index = 0; //This value keeps track of how full the list is
	
	animal searchList(String name) throws AnimalNotFoundException {
		animal a = new animal(); //creates dummy animal to write the found animal to
		for (int i = 0; i < index; i++) {
			if (name.equals(nameList[i].name)) {
				a = nameList[i];
			}
		}
		if (a.age == 0) //if the age is 0, then the animal is still the default (nonexistent) animal in line 35
			throw new AnimalNotFoundException(name + " cannot be found in this list.");
		return a;
		
	}
	
	void add(animal a) { //adds an animal to the list unless full
		if (index != size) {
			nameList[index] = a;
			index++;	
		} else {
			System.out.println("The list is full");
		}
	}
	
	void printList() { //prints out the animals in the list so far
		for (int i = 0; i < index; i++) {
			nameList[i].checkAnimal();
		}
	}
}

class AnimalNotFoundException extends Exception { //This is the custom exception class
	AnimalNotFoundException(String message) {
		super(message);
	}
}

class animal { //This is the class for the animal object
	String name;
	String sound;
	int age;
	
	animal() { //default "dummy" animal
		this.name = "";
		this.sound = "";
		this.age = 0;
	}
	
	animal(String name, String sound, int age) { //actual animal declaration with information
		this.name = name;
		this.sound = sound;
		this.age = age;
	}
	
	void checkAnimal() { //prints out details of the animal object
		System.out.println("This animal, " + name + ", is " + age + " years old and makes a " + sound + " noise.");
	}
}