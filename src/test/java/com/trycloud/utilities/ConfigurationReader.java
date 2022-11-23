package com.trycloud.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    // create the obj of Properties class
    // we need properties class to use methods coming from load(),getProperty("key")
    // it is static because we using it in static method
    // it is private because I will use it only in this class

    private static Properties properties = new Properties(); // using private due to only use inside this class

    // we want to open the properties file and load the properties object only ones before reading
    //we put inside static block so it will run first and only ones

    static {
        try {
            // 2. Create the obj of FileInputStream;
            // we need this obj to open file as a stream in Java memory
            FileInputStream file = new FileInputStream("configuration.properties");

            //3. load the properties obj
            // load properties obj with the "file" we opened using FileInputStream
            properties.load(file);

            // close the file after loading
            //if we do not close the file , it will take space from comp memory like Scanner
            file.close();
        } catch (IOException e) {

        }
    }

    /**
     * This method is used to read value from a configuration.properties file
     * @param keyword --> key name in configuration.properties file
     * @return value for key, returns null if key is not found
     * driver.get(ConfigurationReader.getProperties("env"))
     */
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
