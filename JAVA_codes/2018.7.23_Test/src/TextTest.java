import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * ���Է���BufferedReader��readline������������ѭ��������䣬ÿһ�ε�ѭ�������ж����Իس�����Ϊ�磬���������һ����
 * ���ļ���д��ܳ�һ���ַ�������������֮�䲻�ӻس����У������"���������"��β����ô����ѭ����������Ϊreadline����
 * ����ֻ���������س����вŻ�����ж���������һ���е��ַ�����Ϊ�ڼ�û�лس����У����Ա�����һ����������жϣ����ᱻ
 * ��������������ڼ�������س����У���ô֮ǰ���ı���ᱻ�����ֻ�����һ���ԡ��������������β���ַ������ᱻ�����
 * @author ��������û�Է�
 *
 */
public class TextTest extends JFrame {
	JPanel panel=new JPanel();
	JTextArea area= new JTextArea();
	public TextTest()
	{
		super("laozizhenshicaole");
		this.add(panel);
		this.setBounds(200,500,300,400);
		panel.add(area);
		area.setEditable(true);
		this.setVisible(true);
		
	}
	public static void main (String args[]) throws IOException
	{
		String str=null;
		TextTest mytesTest=new TextTest();
		InputStream filer=new FileInputStream("D:\\Studying\\MyEclipse-MyWork\\2018.7.23_Test\\File_1.txt");
		InputStreamReader in=new InputStreamReader(filer);
	    BufferedReader buffr=new BufferedReader(in);
         while((str=buffr.readLine())!=null&&!str.endsWith("���������"))
	    	    mytesTest.area.append(str+"\n");
	    	
	}

}
