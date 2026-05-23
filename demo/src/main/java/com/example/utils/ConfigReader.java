package com.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    public static void loadProperties() {

        properties = new Properties();

        try {
            FileInputStream fis = new FileInputStream(
                    "src/test/resources/config.properties");

            properties.load(fis);
        }
        catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}