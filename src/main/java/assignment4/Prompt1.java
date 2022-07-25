package assignment4;

//Prompt 1: Write an example for checked exception

//This code contains a class which simply checks if the file exists.
//Since the specified file does not exist, it prints a message that the file does not exist

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Prompt1 {

	public static void main(String[] args) {
		fileInput initialize = new fileInput("C:\\Desktop\\DoesNotExist.lol");
	}

}

class fileInput {
	fileInput(String inputFile) {
		try {
			File testFile = new File(inputFile);
			BufferedReader buff = new BufferedReader(new FileReader(testFile));
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("The specified file does not exist.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}