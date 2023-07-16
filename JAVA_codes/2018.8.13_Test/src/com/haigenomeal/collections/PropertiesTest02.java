package com.haigenomeal.collections;
/**
 * 用Properties从绝对路径进行读取配置文件
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest02 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		pro.load(new FileReader("D:\\Studying\\JAVA_others\\2018.8.13\\db.properties"));
		System.out.println(pro.getProperty("user"));
	}
}
