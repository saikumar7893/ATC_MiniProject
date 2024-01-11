package Utilities;
import java.io.FileInputStream;
import java.util.Properties;
import org.apache.commons.lang3.StringUtils;

// Utility class for reading properties from a configuration file
public class ReadPropertyFile {


    // Method to get a property value based on the provided key

    public static String getProperty1(String key) throws Exception {
        String filePath= System.getProperty("user.dir")+"/src/main/resources/Configuration/Config.properties";
        FileInputStream fr=new FileInputStream(filePath);
        Properties pro = new Properties();
        pro.load(fr);

        // Getting the value associated with the provided key
        String value =pro.get(key).toString();

        //If the value is null then Exception is thrown
        if(StringUtils.isEmpty(value))
        {
            throw new Exception("value is not specified for key: "+key+" in propertiesFile");
        }
        return  value;
    }


}
