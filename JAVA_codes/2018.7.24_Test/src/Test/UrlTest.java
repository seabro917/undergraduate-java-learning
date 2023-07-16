package Test;
/**
 * ���Կ������һ�д���ÿһ����ʾ��������ʹ�õĶ˿ں��ǲ�һ������ġ�����������ôһ�����Ĺ��ɣ�+1+2��������
 */

import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

public class UrlTest {
    public static void main(String[] args) throws UnknownHostException, IOException {
        URL url = new URL("http://www.szu.edu.cn/");        //���ڴ�ѧ��ҳ
        try(Socket socket = new Socket(url.getHost(),80)){  //���������ڴ�ѧ����������
            socket.setSoTimeout(6000);                      //����6���ʾ���ӳ�ʱ����ֹ����������
            System.out.println(socket.getSoTimeout());  
            System.out.println(socket.isConnected());       //��������Ƿ��      
            System.out.println(socket.getKeepAlive());      //̽��������Ƿ��л��ֻ����socket����ʱ����
            System.out.println(socket.isClosed());          //��������Ƿ�ر�
            System.out.println(socket.toString());          //�鿴��������Ϣ
            //�����������
        }
    }
}