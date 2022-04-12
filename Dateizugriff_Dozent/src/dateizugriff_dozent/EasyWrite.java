package dateizugriff_dozent;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EasyWrite {
	private File file;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	public EasyWrite(String filename) {
		this.setFile(new File(filename));
	}
	
	public void writeFile(String...words) {
		
		try {
			FileWriter fw = new FileWriter(this.getFile(), true);
			
			for(String word : words) {
				fw.write(word);
			}
			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
