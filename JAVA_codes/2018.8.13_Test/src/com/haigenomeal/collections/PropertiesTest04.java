package com.haigenomeal.collections;

import java.io.IOException;
import java.util.Properties;
/**
 * ʹ�������·����ȡ�����ļ�
 * binĿ¼��.class�ļ�����
 * @author ��������û�Է�
 *
 */
public class PropertiesTest04 {
	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
		//   ��/��ָ����bin
//	    pro.load(PropertiesTest04.class.getResourceAsStream("/com/haigenomeal/collections/db.properties"));
	    //    �������   �������գ���ʾbin  ������ķ�������һ��/
	    pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("com/haigenomeal/collections/db.properties"));
	    System.out.println(pro.getProperty("user"));
	}

}
