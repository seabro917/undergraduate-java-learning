package com.haigenomeal.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * 输出一个文件夹的子孙级目录|文件的名称 （绝对路径）
 * 1、listFiles（）方法
 * 2、递归
 * @author 海哥昨晚没吃饭
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		String path = "D:/Studying/JAVA_others/2018.8.15";
		File file = new File(path);
		FileOut(file,0);
		
//		实现所有盘符下的文件的绝对路径输出
//		File[] roots = File.listRoots();
//		System.out.println(Arrays.toString(roots));
//		for(File temp:roots){
//			FileOut(temp, 0);
//		}
	}
	public static void FileOut(File file, int level)
	{
		if(file!=null && file.exists()){
			for(int i=0;i<level;i++){
				System.out.print("*");
			}
			System.out.println(file.getAbsolutePath());
		}
		if(file.exists() && file.isDirectory()){
			File[] files = file.listFiles();
			for(File temp:files){
				FileOut(temp,level+1);
			}
			
		}
	}

}
