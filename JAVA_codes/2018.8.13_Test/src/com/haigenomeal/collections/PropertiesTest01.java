package com.haigenomeal.collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest01 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//Properties是HashTable的子类，且里面键值对只能放字符串，一般用于读取资源配置文件。
		Properties properties = new Properties();
		
		properties.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		properties.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		properties.setProperty("user", "haigenomeal");
		properties.setProperty("pwd", "haigedingdingda");
		
		//存储到D:\Studying\JAVA_others 绝对路径 盘符：
		properties.store(new FileOutputStream(new File("D:\\Studying\\JAVA_others\\2018.8.13\\db.properties")), "全世界最炫酷的db配置");
		properties.storeToXML(new FileOutputStream(new File("D:\\Studying\\JAVA_others\\2018.8.13\\db.xml")), "全世界最炫酷的db配置");
		
		//使用相对路径 存储到当前的项目里面
		properties.store(new FileOutputStream(new File("db.properties")), "全世界最炫酷的db配置");
		properties.store(new FileOutputStream(new File("src\\com\\haigenomeal\\collections\\db.properties")), "全世界最炫酷的db配置");
		properties.store(new FileOutputStream(new File("bin\\com\\haigenomeal\\collections\\db.properties")), "全世界最炫酷的db配置");
		
		
		
	}

}
