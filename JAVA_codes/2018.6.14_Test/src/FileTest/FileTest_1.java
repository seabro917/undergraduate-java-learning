package FileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 功能：通过字节输入输出流，完成文件copy  InputStream OutputStream
 * 分析：
 *    源文件                       程序                       目标文件
 *    1.找到源文件
 *    2.读取源文件里的信息  输入 程序
 *    3.将程序读到的数据  写入   源文件
 * 
 *
 */
public class FileTest_1 {
    public static void main(String[] args) throws IOException {
        //1.选择合适流 InputStream OutputStream
        FileInputStream fis=new FileInputStream(new File("D:\\Studying\\MyEclipse-MyWork\\2018.6.14_Test\\FileTest_1.txt"));
        FileOutputStream fos=new FileOutputStream(new File("D:\\Studying\\MyEclipse-MyWork\\2018.6.14_Test\\FileTest_1.txt")); 
        //2.处理数据
            //2.1 创建缓存区
            byte [] buf=new byte[1024];
          
            //2.2从缓存区读数据
            int len = fis.read(buf);
            System.out.print(len);
            while(len!=-1){       //若输入流结束，则read（byte buffer[]）返回-1
                //将读的数据写入 新文件中
                fos.write(buf);
                len=fis.read(buf);//注意点  len再次赋值  读 缓存区的数据
            }
        //3.关流
        fos.close();
        fis.close(); 
        System.out.println("复制完成");
        }
}