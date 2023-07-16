package com.haigenomeal.collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 用properties从相对路径（即当前项目的位置）进行读取配置文件。
 * @author 海哥昨晚没吃饭
 *
 */
public class PropertiesTest03 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		
		pro.load(new FileInputStream(new File("src/com/haigenomeal/collections/db.properties")));
		System.out.println(pro.getProperty("pwd"));
	}

}
