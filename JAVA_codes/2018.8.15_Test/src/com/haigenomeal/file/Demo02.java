package com.haigenomeal.file;

import java.io.File;

/**
 * 相对路径与绝对路径构造File对象
 * 1、相对路径
 * File(String parent, String child);
 * File(File parentfie, String child);
 * 2、绝对路径
 * File(String name);
 * 
 * @author 海哥昨晚没吃饭
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		String parentPath = "D:/Studying/MyEclipse-MyWork/2018.8.15_Test";
		String name = "File_01.txt";
		//相对路径构造
		File file = new File(parentPath,name);
		file = new File(new File(parentPath),name);
	    //输出
		System.out.println(file.getName());
		System.out.println(file.getPath());
		//绝对路径
		file = new File("D:/Studying/MyEclipse-MyWork/2018.8.15_Test/File_01.txt");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		//若没有盘符":"   则以user.dir构建
		file = new File("File_01.txt");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		
		
	}

}
