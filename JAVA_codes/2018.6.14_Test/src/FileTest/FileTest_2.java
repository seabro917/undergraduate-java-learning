package FileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * ���ܣ�ͨ���ֽ����������������ļ�copy  InputStream OutputStream
 * ������
 *    Դ�ļ�                       ����                       Ŀ���ļ�
 *    1.�ҵ�Դ�ļ�
 *    2.��ȡԴ�ļ������Ϣ  ���� ����
 *    3.���������������  д��   Դ�ļ�
 *    
 * ��һ�����ҵ�Դ�ļ�    ��ȡԴ�ļ������Ϣ  ���� ����
 *       ������������ݴ�ӡ������̨
 *       ���Ĳ���
 *          1ѡ����ʵ��������ķ��ࣩ
 *          2��������
 *          3.����
 *
 *
 */
public class FileTest_2 {
  public static void main(String[] args) throws IOException {
      //�ҵ�Դ�ļ�    ��ȡԴ�ļ������Ϣ  ���� ����  ������������ݴ�ӡ������̨
      //1ѡ����ʵ��������ķ��ࣩ
      
      FileInputStream fis=new FileInputStream("D:\\Studying\\MyEclipse-MyWork\\2018.6.14_Test\\FileTest_1.txt");
      //2��������

      /*int n=fis.read();//97
      while(n!=-1){
          System.out.print((char)n);
          n=fis.read();//����ʽ -1
      }*/
      int n=0;
      while((n=fis.read())!=-1){//97
          System.out.print((char)n);   //
      }
      //3����
      fis.close();
  }
}