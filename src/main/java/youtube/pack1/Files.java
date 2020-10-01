package youtube.pack1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter(".\\src\\main\\java\\1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String name = "This is my name and you can't do nothing to save it";
		
		
		bw.write(name);
		bw.append(name);
		
		bw.close();
		fw.close();
		
		
		
		
	}

}
