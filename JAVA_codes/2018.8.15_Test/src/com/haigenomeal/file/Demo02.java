package com.haigenomeal.file;

import java.io.File;

/**
 * ���·�������·������File����
 * 1�����·��
 * File(String parent, String child);
 * File(File parentfie, String child);
 * 2������·��
 * File(String name);
 * 
 * @author ��������û�Է�
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		String parentPath = "D:/Studying/MyEclipse-MyWork/2018.8.15_Test";
		String name = "File_01.txt";
		//���·������
		File file = new File(parentPath,name);
		file = new File(new File(parentPath),name);
	    //���
		System.out.println(file.getName());
		System.out.println(file.getPath());
		//����·��
		file = new File("D:/Studying/MyEclipse-MyWork/2018.8.15_Test/File_01.txt");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		//��û���̷�":"   ����user.dir����
		file = new File("File_01.txt");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		
		
	}

}
