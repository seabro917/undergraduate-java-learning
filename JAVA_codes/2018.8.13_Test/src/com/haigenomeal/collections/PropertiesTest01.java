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
		//Properties��HashTable�����࣬�������ֵ��ֻ�ܷ��ַ�����һ�����ڶ�ȡ��Դ�����ļ���
		Properties properties = new Properties();
		
		properties.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		properties.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		properties.setProperty("user", "haigenomeal");
		properties.setProperty("pwd", "haigedingdingda");
		
		//�洢��D:\Studying\JAVA_others ����·�� �̷���
		properties.store(new FileOutputStream(new File("D:\\Studying\\JAVA_others\\2018.8.13\\db.properties")), "ȫ�������ſ��db����");
		properties.storeToXML(new FileOutputStream(new File("D:\\Studying\\JAVA_others\\2018.8.13\\db.xml")), "ȫ�������ſ��db����");
		
		//ʹ�����·�� �洢����ǰ����Ŀ����
		properties.store(new FileOutputStream(new File("db.properties")), "ȫ�������ſ��db����");
		properties.store(new FileOutputStream(new File("src\\com\\haigenomeal\\collections\\db.properties")), "ȫ�������ſ��db����");
		properties.store(new FileOutputStream(new File("bin\\com\\haigenomeal\\collections\\db.properties")), "ȫ�������ſ��db����");
		
		
		
	}

}
