package youtube.pack1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File(".\\src\\main\\resources\\youtube\\pack2\\pro.properties");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		
		Properties pro = new Properties();
		
		pro.put("First", "1");
		pro.put("Second", "2");
		pro.put("Third", "3");
		
		pro.store(fos, "First Storing");
		
		fos.close();
		
		
		
		
		
	}

}
