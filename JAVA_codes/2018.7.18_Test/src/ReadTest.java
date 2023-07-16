import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 观察每次从文件读取数据之后被读取的数据还在不在原文件里面了...
 * @author 海哥昨晚没吃饭
 *
 */
public class ReadTest {
	public static void main(String args[]) throws IOException {
		int i;
		FileInputStream fin=new FileInputStream("D:\\Studying\\MyEclipse-MyWork\\2018.7.18_Test\\File_1.txt");
		while((i=fin.read())!=-1)
			System.out.println((char)i);
	}
//读取过后原文件中的数据还存在，即若不在代码中进行手动删除或者写入新数据，原数据不会丢失。
}
