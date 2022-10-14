package pirzhan.configReaderPirzhan;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReaderPirzhan {

    private static Properties properties;


    static {
        try {
            String path = "src/main/resources/configurations.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            input.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getPropertyPirzhan(String key){
        return properties.getProperty(key).trim();
    }
}
