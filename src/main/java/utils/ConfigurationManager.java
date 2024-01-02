package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationManager {
    private static final String CONFIG_FILE_PATH = "src/main/resources/dataProviders/Config.properties";

    public static String getBrowserName() {
        Properties properties = new Properties();
        try (FileReader reader = new FileReader(CONFIG_FILE_PATH)) {
            properties.load(reader);
            return properties.getProperty("browser");
        } catch (IOException e) {
            return null;
        }
    }
}
