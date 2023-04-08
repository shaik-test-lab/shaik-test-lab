package com.qspiders.trello.genericutility;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
public String Read_data_home_prop(String key) throws Throwable  {
	FileInputStream home_data = new FileInputStream("./src/test/resource/test_data_common_propertyfiles/home page test data.properties");
	Properties pobj = new Properties();
	pobj.load(home_data);
	String value = pobj.getProperty(key);
	return value;
}
public String Read_data_common_prop(String key) throws Throwable   {
	FileInputStream common_data = new FileInputStream("./src/test/resource/test_data_common_propertyfiles/common_data.properties");
	Properties pobj = new Properties();
	pobj.load(common_data);
	String value = pobj.getProperty(key);
	return value;
}


}
