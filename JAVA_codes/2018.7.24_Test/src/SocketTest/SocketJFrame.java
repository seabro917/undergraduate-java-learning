package SocketTest;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SocketJFrame extends JFrame
{
	private Socket socket;
	private JTextArea area;
	
	public SocketJFrame(String name,Socket socket) throws IOException
	{
		super("��������Ϊ��"+name);
		this.setBounds(200,300, 350, 350);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		area=new JTextArea();
		area.setLineWrap(true);
		this.add(area);
		this.setVisible(true);
		
		this.area.append("����Socket��ip��ַΪ:"+socket.getInetAddress()+",����Socket�Ķ˿ں�Ϊ:"+socket.getLocalPort());
	}
	
	public SocketJFrame(String name,String host,int port) throws IOException
	{
		this(name,new Socket(host,port));
	}

	public static void main(String[] args) throws IOException
	{
		new SocketJFrame("�ͻ���","127.0.0.1",2005);
	}

}
