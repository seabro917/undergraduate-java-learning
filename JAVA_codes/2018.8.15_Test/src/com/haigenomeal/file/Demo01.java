package com.haigenomeal.file;
/**
 * ��������
 * 1��·���ָ���  ��;��
 * 2�����Ʒָ���  windows��"\"  ��windows��"/"
 */
import java.io.File;

public class Demo01 {
	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		//·���ı�ʾ��ʽ
		String path = "D:\\Studying\\MyEclipse-MyWork\\2018.8.15_Test\\File_01.txt";  // "/"������ĺ��壨ת���ַ���
		//��̬����ʱʹ�÷���
		path = "D:"+File.separator+"Studying"+File.separator+"MyEclipse-MyWork"+File.separator+"2018.8.15_Test"+File.separator+"File_01.txt";
		//�Ƽ���ʹ�÷�ʽ
		path = "D:/Studying/MyEclipse-MyWork/2018.8.15_Test/File_01.txt";
		
		
	}
}
