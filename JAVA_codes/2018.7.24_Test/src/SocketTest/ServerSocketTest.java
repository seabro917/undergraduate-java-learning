package SocketTest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest
{
	public ServerSocketTest(int port) throws IOException
	{
		ServerSocket ser=new ServerSocket(port);
		System.out.println(ser.getLocalPort());
		Socket socket=ser.accept();
		new SocketJFrame("·þÎñ¶Ë",socket);
	}
	
	public static void main(String args[]) throws IOException
	{
		new ServerSocketTest(2005);
	}

}
