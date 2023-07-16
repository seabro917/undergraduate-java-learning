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
		super("本方名称为："+name);
		this.setBounds(200,300, 350, 350);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		area=new JTextArea();
		area.setLineWrap(true);
		this.add(area);
		this.setVisible(true);
		
		this.area.append("本方Socket的ip地址为:"+socket.getInetAddress()+",本方Socket的端口号为:"+socket.getLocalPort());
	}
	
	public SocketJFrame(String name,String host,int port) throws IOException
	{
		this(name,new Socket(host,port));
	}

	public static void main(String[] args) throws IOException
	{
		new SocketJFrame("客户端","127.0.0.1",2005);
	}

}
