import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReader {
	private String fileName;
	
	
	public FileReader(String fileName) {
		
		this.fileName = fileName;
		
		
			
//	
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
