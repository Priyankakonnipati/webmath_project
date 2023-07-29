package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) {
		
		FileReader fr;
		try {
			fr = new FileReader ("System.getProperty(\"user.dir\")+/src/test/resources/configfiles/config.properties");
			Properties p= new Properties();
			p.load(fr);
			System.out.println(p.getProperty("browser"));
			System.out.println(p.getProperty("testurl"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
