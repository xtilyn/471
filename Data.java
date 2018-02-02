import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Data {
	
	private String fileName;
	public static String name;
	
	//This main method is just for testing!
	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(new FileInputStream("data.txt"));
			
			
//				//read the name 
//				String temp = sc.nextLine();
//				if (temp.equals("Name:")) {
//					name = sc.nextLine();
//				}
				
			
			
				sc.useDelimiter("forced partial assignment:");
				String arr[] = sc.next().split("\n");
				
//				System.out.println(arr.length);
				
				for (int i = 1; i < arr.length; i ++) {
					if (!(arr[i].trim() == "" || arr[i].trim() == "\n")) {
						System.out.println(arr[i]);
					}

				}
				
				
				sc.useDelimiter("forbidden machine:");
				String arr1[] = sc.next().split("\n");
				
//				System.out.println(arr1.length);
				
				for (int i = 1; i < arr1.length; i ++) {
					if (!(arr1[i].trim() == "" || arr1[i].trim() == "\n")) {
						System.out.println(arr1[i]);
					}

				}
				System.out.println("");
				
				sc.useDelimiter("too-near tasks:");
				String arr2[] = sc.next().split("\n");
				
//				System.out.println(arr1.length);
				
				for (int i = 1; i < arr2.length; i ++) {
					if (!(arr2[i].trim() == "" || arr2[i].trim() == "\n")) {
						System.out.println(arr2[i]);
					}

				}
				
				System.out.println("");
				
				sc.useDelimiter("machine penalties:");
				String arr3[] = sc.next().split("\n");
				
//				System.out.println(arr1.length);
				
				for (int i = 1; i < arr3.length; i ++) {
					if (!(arr3[i].trim() == "" || arr3[i].trim() == "\n")) {
						System.out.println(arr3[i]);
					}

				}
				
				System.out.println("");
				
				sc.useDelimiter("too-near penalties:");
				String arr4[] = sc.next().split("\n");
				
//				System.out.println(arr1.length);
				String[][] macPenArrStr = new String[8][8];
				int[][] macPenArrInt = new int[8][8];
				
				//System.out.println(arr4.length);
				
				for (int i = 1; i < arr4.length; i ++) {
					if (!(arr4[i].trim() == "" || arr4[i].trim() == "\n")) {
						System.out.println(arr4[i]);
						macPenArrStr[i-1] = arr4[i].split(" "); 
						for (int j = 0; j < 8; j ++) {
							macPenArrInt[i-1][j] = Integer.parseInt(macPenArrStr[i-1][j]);
						}
						
					}

				}

				System.out.println("");
				sc.nextLine();
				String temp;
				while (sc.hasNextLine()) {
						temp = sc.nextLine();
						if (!(temp.trim().equalsIgnoreCase("") || temp.trim().equalsIgnoreCase("\n") )) {
							System.out.println(temp);
						}
						
					}

				
//			
				
			
		}
		catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		
	}
	
}
