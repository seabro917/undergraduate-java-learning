package FileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���ܣ�ͨ���ֽ����������������ļ�copy  InputStream OutputStream
 * ������
 *    Դ�ļ�                       ����                       Ŀ���ļ�
 *    1.�ҵ�Դ�ļ�
 *    2.��ȡԴ�ļ������Ϣ  ���� ����
 *    3.���������������  д��   Դ�ļ�
 * 
 *
 */
public class FileTest_1 {
    public static void main(String[] args) throws IOException {
        //1.ѡ������� InputStream OutputStream
        FileInputStream fis=new FileInputStream(new File("D:\\Studying\\MyEclipse-MyWork\\2018.6.14_Test\\FileTest_1.txt"));
        FileOutputStream fos=new FileOutputStream(new File("D:\\Studying\\MyEclipse-MyWork\\2018.6.14_Test\\FileTest_1.txt")); 
        //2.��������
            //2.1 ����������
            byte [] buf=new byte[1024];
          
            //2.2�ӻ�����������
            int len = fis.read(buf);
            System.out.print(len);
            while(len!=-1){       //����������������read��byte buffer[]������-1
                //����������д�� ���ļ���
                fos.write(buf);
                len=fis.read(buf);//ע���  len�ٴθ�ֵ  �� ������������
            }
        //3.����
        fos.close();
        fis.close(); 
        System.out.println("�������");
        }
}