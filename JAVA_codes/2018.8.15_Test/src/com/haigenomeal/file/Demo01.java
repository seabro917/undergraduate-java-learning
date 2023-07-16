package com.haigenomeal.file;
/**
 * 两个常量
 * 1、路径分隔符  “;”
 * 2、名称分隔符  windows下"\"  非windows下"/"
 */
import java.io.File;

public class Demo01 {
	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		//路径的表示形式
		String path = "D:\\Studying\\MyEclipse-MyWork\\2018.8.15_Test\\File_01.txt";  // "/"有特殊的含义（转义字符）
		//动态生成时使用方法
		path = "D:"+File.separator+"Studying"+File.separator+"MyEclipse-MyWork"+File.separator+"2018.8.15_Test"+File.separator+"File_01.txt";
		//推荐的使用方式
		path = "D:/Studying/MyEclipse-MyWork/2018.8.15_Test/File_01.txt";
		
		
	}
}
