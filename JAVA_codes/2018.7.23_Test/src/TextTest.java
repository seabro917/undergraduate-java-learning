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
 * 可以发现BufferedReader的readline（）方法若和循环体相搭配，每一次的循环条件判断是以回车换行为界，比如如果我一次性
 * 在文件中写入很长一段字符串，并且它们之间不加回车换行，最后以"输入结束辣"结尾，那么根据循环条件，因为readline（）
 * 方法只有在遇到回车换行才会进行判定，所以这一整行的字符串因为期间没有回车换行，所以被当成一个整体进行判断，不会被
 * 输出，但是若在期间随便加入回车换行，那么之前的文本则会被输出，只有最后一个以“输入结束辣”结尾的字符串不会被输出。
 * @author 海哥昨晚没吃饭
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
         while((str=buffr.readLine())!=null&&!str.endsWith("输入结束辣"))
	    	    mytesTest.area.append(str+"\n");
	    	
	}

}
