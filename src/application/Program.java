package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
		
		String path = "C:\\Arquivos\\Escrita\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String line : lines) {                            /*FileWriter(path) - Create a new one and replace*/
				bw.write(line);                                    /*FileWriter(path,true) - Create a new one if you don't have it and add*/   
				bw.newLine();
				System.out.println("Pronto!");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}  
}
