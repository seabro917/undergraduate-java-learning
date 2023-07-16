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
 * @author 海哥昨晚没吃饭
 *
 */
public class FileUtil {
	public static void main(String[] args) {
		String srcPath = "D:/Studying/MyEclipse-MyWork/2018.8.20_Test/heiheihei.jpg";
		String destPath = "D:/Studying/MyEclipse-MyWork/2018.8.20_Test/xixixi.jpg";
		try {
			FileCopy(srcPath, destPath);
		} catch (FileNotFoundException e) {
			System.err.println("指定源文件不存在！");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("拷贝文件失败！");
			e.printStackTrace();
		}

	}
	/**
	 * 实现文件的拷贝
	 * @param 源文件路径
	 * @param 目标文件路径
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void FileCopy(String srcPath , String destPath) throws FileNotFoundException,IOException {
		FileCopy(new File(srcPath), new File(destPath));
	}

	/**
	 * 实现文件拷贝的重载
	 * @param 源文件对象
	 * @param 目标文件对象
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void FileCopy(File src , File dest) throws FileNotFoundException,IOException {
		if(!src.isFile()){
			throw new IOException("只能拷贝文件！");
		}
		//2、选择流
		InputStream is = new FileInputStream(src);
		OutputStream os  = new FileOutputStream(dest);
		//3、文件的拷贝 循环+读取+写出
		byte[] buff = new byte[1024];
		int len = 0;
		//读取
		while((len=is.read(buff))!=-1){
			//写出
			os.write(buff, 0, len);
		}
		os.flush();  //强制刷出
		os.close();
		is.close();
	}

	/**
	 * 文件夹的拷贝函数入口（先行准备工作，保证目标文件夹下）
	 * @param src
	 * @param dest
	 * @throws IOException 
	 */
	public static void DirCopy(File src, File dest) throws IOException{
		if(dest.isFile()){
			throw new IOException("目标地址为文件，无法拷贝！");
		}
		if(src.isFile()){
			throw new IOException("原地址为文件，无法拷贝！");
		}
		if(src.isDirectory()){
			//在目标文件夹下再创建一个与源文件夹名字相同的文件夹(并没有真正创建，只是建立联系，在DirCopyDetails里面进行真正创建)
			dest = new File(dest,src.getName());  
		} 
		DirCopyDetails(src, dest);

	}
	/**
	 * 文件夹拷贝函数的细节部分
	 * 注意这里的参数dest和DirCopy里面dest的区别
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
			dest.mkdir();    //CopyDir里面只是和文件建立关系，并没有真正在硬盘上创建文件夹
			for(File temp:src.listFiles()){
				DirCopyDetails(temp, new File(dest,temp.getName()));    //递归
			}
		}
	}
}
