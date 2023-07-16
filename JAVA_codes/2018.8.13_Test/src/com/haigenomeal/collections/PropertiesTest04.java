package com.haigenomeal.collections;

import java.io.IOException;
import java.util.Properties;
/**
 * 使用类相对路径读取配置文件
 * bin目录（.class文件）下
 * @author 海哥昨晚没吃饭
 *
 */
public class PropertiesTest04 {
	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
		//   “/”指的是bin
//	    pro.load(PropertiesTest04.class.getResourceAsStream("/com/haigenomeal/collections/db.properties"));
	    //    类加载器   “”（空）表示bin  比上面的方法少了一个/
	    pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("com/haigenomeal/collections/db.properties"));
	    System.out.println(pro.getProperty("user"));
	}

}
