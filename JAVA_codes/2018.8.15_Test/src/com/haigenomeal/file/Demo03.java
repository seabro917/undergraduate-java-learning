package com.haigenomeal.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * File类常用方法
 * 1、文件名
 * getName()
 * getPath()
 * getAbsoluteFile()
 * getAbsolutePath()
 * getParent() 父目录，相对路径的父目录
 * @author 海哥昨晚没吃饭
 * 2、判断信息
 * exists()
 * canWrite()
 * canRead()
 * isFile()
 * isDirectory()
 * isAbsoulute()
 *3、文件长度  以字节数为单位 不能读取文件夹的长度
 * length（）
 * 4、创建和删除文件
 * creatNewFile()
 * delete()
 * static createTempFile  前缀3个字节长，后缀默认.temp 默认临时空间
 * static createTempFile  前缀3个字节长，后缀默认.temp 目录
 * deleteonExit() 退出虚拟机删除，常用于删除临时文件
 * 5、操作目录
 * mkdir() 创建目录 必须保证父目录存在，否则创建失败
 * mkdirs()  创建目录 如果父目录链不存在则一同创建
 * list()  文件或者目录字符串形式
 * static listRoots()  根路径
 */
public class Demo03 {
	public static void main(String[] args) throws IOException, InterruptedException {
		test04();
		
	}
	//1、名称
	public static void test01()
	{
		//建立联系
		File file = new File("D:/Studying/MyEclipse-MyWork/2018.8.15_Test/File_01.txt");
		System.out.println(file.getName());  //返回名称
		System.out.println(file.getPath());  //如果文件对象是绝对路径构造的，返回完整路径，否则返回相对路径。
		System.out.println(file.getAbsolutePath()); //返回绝对路径
		System.out.println(file.getParent());  //返回上一级目录，如果是相对路径构造的文件对象，则返回null
	}
	
	//2、判断信息
	public static void test02()
	{
		File file = new File("D:/Studying/MyEclipse-MyWork/2018.8.15_Test/File_01.txt");
		System.out.println("文件是否存在："+file.exists());
		
		//判断文件对象是文件还是文件夹
		if(file.isFile()) {
			System.out.println("文件");
		}else if(file.isDirectory()) {
			System.out.println("文件夹");
		}else {        //还有文件不存在的情况
 			System.out.println("文件不存在！");
		}
		System.out.println(file.length());
	}
	
	//4、创建和删除文件
	public  static void test03() throws IOException, InterruptedException
	{
		String path = "D:/Studying/MyEclipse-MyWork/2018.8.15_Test/File_02.txt";
		File file = new File(path);
		if(!file.exists())
		{
			boolean flag = file.createNewFile();
			System.out.println(flag? "文件创建成功":"文件创建失败");
		}
		boolean flag = file.delete();
		System.out.println(flag? "文件删除成功":"文件删除失败");
		
		File tempFile = File.createTempFile("abb", ".temp",new File("D:/Studying/MyEclipse-MyWork/2018.8.15_Test"));
		Thread.sleep(10000);
		file.deleteOnExit();
	}
	
	//5、操作目录
	public static void test04()
	{
		String path = "D:/Studying/MyEclipse-MyWork/2018.8.15_Test/haigege/dingdingda";  
		File file = new File(path);
		file.mkdir();   //要确保父路径存在
		
		String path2 = "D:/Studying/MyEclipse-MyWork/2018.8.15_Test/只要是/二次元女孩子/那么就都是我/老婆/请问有什么问题吗？";  
		File file2 = new File(path2);
		file2.mkdirs();
		
		String path3 = "D:/Studying/MyEclipse-MyWork/2018.8.15_Test/test";
		File file3 = new File(path3);
		if(file3.exists()&&file3.isDirectory()){  //存在并且为路径
			System.out.println("******子目录|文件名*******");
			String[] subName = file3.list();
			for(String temp:subName){
				System.out.println(temp);
			}
			System.out.println("*******子目录|文件File对象*******");
			File[] files = file3.listFiles();
			for(File temp:files){
				System.out.println(temp.getAbsolutePath());
			}
			System.out.println("*******子文件.bmp对象*******");
			//命令设计模式
			File[] filterfiles = file3.listFiles(new FilenameFilter() {
				
				@Override
				/**
				 * dir代表的就是file3
				 */
				public boolean accept(File dir, String name) {
//					System.out.println(dir.getName());
					return new File(dir,name).isFile() && name.endsWith(".bmp");
				}
			});
			for(File temp:filterfiles){
				System.out.println(temp.getAbsolutePath());
			}
			
		}
		
			
		
	}

}

