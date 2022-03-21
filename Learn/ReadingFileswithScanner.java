package Learn;
import java.io.*;
import java.util.*;

public class ReadingFileswithScanner 
{
	public static void main(String args[]) throws FileNotFoundException
	{
		String myFile = "D:\\Java\\java\\text.txt";
		
		File file = new File(myFile);
		
		Scanner text = new Scanner(file);
		
		int value = text.nextInt();
		System.out.println("Value is: "+value);
		
		while(text.hasNextLine())
		{
			String line = text.nextLine();
			System.out.println(line);
		}
		text.close();
	}

}
