package utilities;



	import java.io.FileInputStream;
	import java.util.Properties;

	public class ConfigReader {

	    public static Properties prop;

	    static {
	        try {
	            FileInputStream fis = new FileInputStream(
	            		System.getProperty("user.dir") + "/src/main/resources/config.properties"
	            );

	            prop = new Properties();
	            prop.load(fis);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    // ✅ THIS METHOD IS REQUIRED
	    public static String get(String key) {
	        return prop.getProperty(key);
	    }

		
			
		}
	
