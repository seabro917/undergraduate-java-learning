package com.haigenomeal.ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.sound.midi.SysexMessage;
/**
 * 
 * @author ��������û�Է�
 *
 */
public class FileUtil {
	public static void main(String[] args) {
		String srcPath = "D:/Studying/MyEclipse-MyWork/2018.8.20_Test/heiheihei.jpg";
		String destPath = "D:/Studying/MyEclipse-MyWork/2018.8.20_Test/xixixi.jpg";
		try {
			FileCopy(srcPath, destPath);
		} catch (FileNotFoundException e) {
			System.err.println("ָ��Դ�ļ������ڣ�");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("�����ļ�ʧ�ܣ�");
			e.printStackTrace();
		}

	}
	/**
	 * ʵ���ļ��Ŀ���
	 * @param Դ�ļ�·��
	 * @param Ŀ���ļ�·��
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void FileCopy(String srcPath , String destPath) throws FileNotFoundException,IOException {
		FileCopy(new File(srcPath), new File(destPath));
	}

	/**
	 * ʵ���ļ�����������
	 * @param Դ�ļ�����
	 * @param Ŀ���ļ�����
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void FileCopy(File src , File dest) throws FileNotFoundException,IOException {
		if(!src.isFile()){
			throw new IOException("ֻ�ܿ����ļ���");
		}
		//2��ѡ����
		InputStream is = new FileInputStream(src);
		OutputStream os  = new FileOutputStream(dest);
		//3���ļ��Ŀ��� ѭ��+��ȡ+д��
		byte[] buff = new byte[1024];
		int len = 0;
		//��ȡ
		while((len=is.read(buff))!=-1){
			//д��
			os.write(buff, 0, len);
		}
		os.flush();  //ǿ��ˢ��
		os.close();
		is.close();
	}

	/**
	 * �ļ��еĿ���������ڣ�����׼����������֤Ŀ���ļ����£�
	 * @param src
	 * @param dest
	 * @throws IOException 
	 */
	public static void DirCopy(File src, File dest) throws IOException{
		if(dest.isFile()){
			throw new IOException("Ŀ���ַΪ�ļ����޷�������");
		}
		if(src.isFile()){
			throw new IOException("ԭ��ַΪ�ļ����޷�������");
		}
		if(src.isDirectory()){
			//��Ŀ���ļ������ٴ���һ����Դ�ļ���������ͬ���ļ���(��û������������ֻ�ǽ�����ϵ����DirCopyDetails���������������)
			dest = new File(dest,src.getName());  
		} 
		DirCopyDetails(src, dest);

	}
	/**
	 * �ļ��п���������ϸ�ڲ���
	 * ע������Ĳ���dest��DirCopy����dest������
	 * @param src
	 * @param dest
	 */
	public static void DirCopyDetails(File src, File dest){
		if(src.isFile()){
			try {
				FileUtil.FileCopy(src, dest);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if(src.isDirectory()){
			dest.mkdir();    //CopyDir����ֻ�Ǻ��ļ�������ϵ����û��������Ӳ���ϴ����ļ���
			for(File temp:src.listFiles()){
				DirCopyDetails(temp, new File(dest,temp.getName()));    //�ݹ�
			}
		}
	}
}
