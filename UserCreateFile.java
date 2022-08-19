package Project1;

import java.util.*;
import java.io.*;

public class UserCreateFile {
	public void addFile() throws IOException {
		System.out.println("Enter a file to add");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		File file = new File("C:\\Users\\staff\\eclipse-workspace\\Phase1Project\\src\\Root\\" + input);

		//Create the file
		if (file.createNewFile()){
			System.out.println("File is created!");
		}
		else{
			System.out.println("File already exists.");
		}
	}
}


