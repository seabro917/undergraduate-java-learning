package com.haigenomeal.collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * ��properties�����·��������ǰ��Ŀ��λ�ã����ж�ȡ�����ļ���
 * @author ��������û�Է�
 *
 */
public class PropertiesTest03 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		
		pro.load(new FileInputStream(new File("src/com/haigenomeal/collections/db.properties")));
		System.out.println(pro.getProperty("pwd"));
	}

}
