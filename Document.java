package dsaa.ab01;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Document {
	public static void loadDocument(String name, Scanner scan) throws
	FileNotFoundException {
		
		File file = new File("file.txt");
		Scanner sc= new Scanner(file);
		while (sc.hasNext()) {
			String i= sc.next();
			}
			sc.close();
		
		
		//TODO
		

	
	
	// accepted only small letters, capitalic letter, digits nad '_' (but not on the begin)
	public static boolean correctLink(String link) {
		// TODO
		return true;

}
}
