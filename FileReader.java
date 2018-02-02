import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReader {
	private String fileName;
	
	
	public FileReader(String fileName) {
		
		this.fileName = fileName;
		
		
			
//		try {
//		Scanner sc = new Scanner(new FileInputStream(fileName));
//		} catch (FileNotFoundException e) {
//		// error message I guess?
//		e.printStackTrace();
//		}	
	}
	
	
	public String line() {
		try {
			Scanner sc = new Scanner(new FileInputStream(this.fileName));
			if (sc.hasNext())
				return sc.nextLine();
				
		}
		catch (FileNotFoundException e){
			return null;
		}
		return "";
	}
	
	
	
	
	
	
}
