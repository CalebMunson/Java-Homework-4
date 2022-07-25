package assignment4;

//Prompt 2: Write an example for un-checked exception, and handle it using try catch block

//This code simply includes an array and a line of code which checks for an out of bounds instance in the array
//This line is surrounded by a try catch block which tests for ArrayIndexOutOfBoundsException

public class Prompt2 {

	public static void main(String[] args) {
		int[] numList = {1, 2, 3, 4, 5, 6};
		try {
			System.out.println(numList[6]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The index is out of bounds.");
		}
	}

}
