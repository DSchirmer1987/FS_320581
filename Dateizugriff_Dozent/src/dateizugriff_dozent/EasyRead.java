package dateizugriff_dozent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EasyRead {
	private File file;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	public EasyRead(String filename) {
		this.setFile(new File(filename));
	}
	
	public void readFile() {
		try {
			Scanner scanner = new Scanner(this.getFile());
			
			while(scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
