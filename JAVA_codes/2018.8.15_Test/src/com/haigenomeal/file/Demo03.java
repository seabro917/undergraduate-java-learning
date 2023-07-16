package com.haigenomeal.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * File�ೣ�÷���
 * 1���ļ���
 * getName()
 * getPath()
 * getAbsoluteFile()
 * getAbsolutePath()
 * getParent() ��Ŀ¼�����·���ĸ�Ŀ¼
 * @author ��������û�Է�
 * 2���ж���Ϣ
 * exists()
 * canWrite()
 * canRead()
 * isFile()
 * isDirectory()
 * isAbsoulute()
 *3���ļ�����  ���ֽ���Ϊ��λ ���ܶ�ȡ�ļ��еĳ���
 * length����
 * 4��������ɾ���ļ�
 * creatNewFile()
 * delete()
 * static createTempFile  ǰ׺3���ֽڳ�����׺Ĭ��.temp Ĭ����ʱ�ռ�
 * static createTempFile  ǰ׺3���ֽڳ�����׺Ĭ��.temp Ŀ¼
 * deleteonExit() �˳������ɾ����������ɾ����ʱ�ļ�
 * 5������Ŀ¼
 * mkdir() ����Ŀ¼ ���뱣֤��Ŀ¼���ڣ����򴴽�ʧ��
 * mkdirs()  ����Ŀ¼ �����Ŀ¼����������һͬ����
 * list()  �ļ�����Ŀ¼�ַ�����ʽ
 * static listRoots()  ��·��
 */
public class Demo03 {
	public static void main(String[] args) throws IOException, InterruptedException {
		test04();
		
	}
	//1������
	public static void test01()
	{
		//������ϵ
		File file = new File("D:/Studying/MyEclipse-MyWork/2018.8.15_Test/File_01.txt");
		System.out.println(file.getName());  //��������
		System.out.println(file.getPath());  //����ļ������Ǿ���·������ģ���������·�������򷵻����·����
		System.out.println(file.getAbsolutePath()); //���ؾ���·��
		System.out.println(file.getParent());  //������һ��Ŀ¼����������·��������ļ������򷵻�null
	}
	
	//2���ж���Ϣ
	public static void test02()
	{
		File file = new File("D:/Studying/MyEclipse-MyWork/2018.8.15_Test/File_01.txt");
		System.out.println("�ļ��Ƿ���ڣ�"+file.exists());
		
		//�ж��ļ��������ļ������ļ���
		if(file.isFile()) {
			System.out.println("�ļ�");
		}else if(file.isDirectory()) {
			System.out.println("�ļ���");
		}else {        //�����ļ������ڵ����
 			System.out.println("�ļ������ڣ�");
		}
		System.out.println(file.length());
	}
	
	//4��������ɾ���ļ�
	public  static void test03() throws IOException, InterruptedException
	{
		String path = "D:/Studying/MyEclipse-MyWork/2018.8.15_Test/File_02.txt";
		File file = new File(path);
		if(!file.exists())
		{
			boolean flag = file.createNewFile();
			System.out.println(flag? "�ļ������ɹ�":"�ļ�����ʧ��");
		}
		boolean flag = file.delete();
		System.out.println(flag? "�ļ�ɾ���ɹ�":"�ļ�ɾ��ʧ��");
		
		File tempFile = File.createTempFile("abb", ".temp",new File("D:/Studying/MyEclipse-MyWork/2018.8.15_Test"));
		Thread.sleep(10000);
		file.deleteOnExit();
	}
	
	//5������Ŀ¼
	public static void test04()
	{
		String path = "D:/Studying/MyEclipse-MyWork/2018.8.15_Test/haigege/dingdingda";  
		File file = new File(path);
		file.mkdir();   //Ҫȷ����·������
		
		String path2 = "D:/Studying/MyEclipse-MyWork/2018.8.15_Test/ֻҪ��/����ԪŮ����/��ô�Ͷ�����/����/������ʲô������";  
		File file2 = new File(path2);
		file2.mkdirs();
		
		String path3 = "D:/Studying/MyEclipse-MyWork/2018.8.15_Test/test";
		File file3 = new File(path3);
		if(file3.exists()&&file3.isDirectory()){  //���ڲ���Ϊ·��
			System.out.println("******��Ŀ¼|�ļ���*******");
			String[] subName = file3.list();
			for(String temp:subName){
				System.out.println(temp);
			}
			System.out.println("*******��Ŀ¼|�ļ�File����*******");
			File[] files = file3.listFiles();
			for(File temp:files){
				System.out.println(temp.getAbsolutePath());
			}
			System.out.println("*******���ļ�.bmp����*******");
			//�������ģʽ
			File[] filterfiles = file3.listFiles(new FilenameFilter() {
				
				@Override
				/**
				 * dir����ľ���file3
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

