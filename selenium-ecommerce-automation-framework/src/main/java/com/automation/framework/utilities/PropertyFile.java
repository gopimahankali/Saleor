package com.automation.framework.utilities;

import java.io.FileInputStream;
import java.util.Properties;


public class PropertyFile {
public String read(String key) throws Exception {
	FileInputStream fis = new FileInputStream("./testdata/CommonData.properties");
	Properties prop = new Properties();
	prop.load(fis);
	String value = prop.getProperty(key);
	return value;
}
}
