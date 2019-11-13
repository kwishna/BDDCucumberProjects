package Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigReader {
	
	private static String resourceFolder = System.getProperty("user.dir")+"\\src\\test\\resources\\Properties";
	
	public static String readValue(String key) {
		
		Properties prop = new Properties();
		
		try {
			prop.load(Files.newBufferedReader(Paths.get(resourceFolder, "Config.properties")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
	}
	
}