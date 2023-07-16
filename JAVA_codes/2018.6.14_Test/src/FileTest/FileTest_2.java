package FileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 功能：通过字节输入输出流，完成文件copy  InputStream OutputStream
 * 分析：
 *    源文件                       程序                       目标文件
 *    1.找到源文件
 *    2.读取源文件里的信息  输入 程序
 *    3.将程序读到的数据  写入   源文件
 *    
 * 第一步：找到源文件    读取源文件里的信息  输入 程序
 *       将程序读到内容打印到控制台
 *       流的操作
 *          1选择合适的流（流的分类）
 *          2处理数据
 *          3.关流
 *
 *
 */
public class FileTest_2 {
  public static void main(String[] args) throws IOException {
      //找到源文件    读取源文件里的信息  输入 程序  将程序读到内容打印到控制台
      //1选择合适的流（流的分类）
      
      FileInputStream fis=new FileInputStream("D:\\Studying\\MyEclipse-MyWork\\2018.6.14_Test\\FileTest_1.txt");
      //2处理数据

      /*int n=fis.read();//97
      while(n!=-1){
          System.out.print((char)n);
          n=fis.read();//迭代式 -1
      }*/
      int n=0;
      while((n=fis.read())!=-1){//97
          System.out.print((char)n);   //
      }
      //3关流
      fis.close();
  }
}