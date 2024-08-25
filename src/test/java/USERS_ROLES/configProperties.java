package USERS_ROLES;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configProperties {
	
	public static Properties property = new Properties();
	
	private static String configPath = "Configuration/Configsetting.Properties";
	
	public static void initializePropertyFile() {
		try (InputStream instm = new FileInputStream(configPath)) {
			property.load(instm);
			//System.out.println("Properties loaded successfully");
		} catch (FileNotFoundException e) {
			//System.out.println("Configuration file not found: " + configPath);
			e.printStackTrace();
		} catch (IOException e) {
			//System.out.println("Error reading configuration file: " + configPath);
			e.printStackTrace();
		}
	}
}
