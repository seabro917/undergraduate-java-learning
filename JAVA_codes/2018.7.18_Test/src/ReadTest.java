import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �۲�ÿ�δ��ļ���ȡ����֮�󱻶�ȡ�����ݻ��ڲ���ԭ�ļ�������...
 * @author ��������û�Է�
 *
 */
public class ReadTest {
	public static void main(String args[]) throws IOException {
		int i;
		FileInputStream fin=new FileInputStream("D:\\Studying\\MyEclipse-MyWork\\2018.7.18_Test\\File_1.txt");
		while((i=fin.read())!=-1)
			System.out.println((char)i);
	}
//��ȡ����ԭ�ļ��е����ݻ����ڣ��������ڴ����н����ֶ�ɾ������д�������ݣ�ԭ���ݲ��ᶪʧ��
}
