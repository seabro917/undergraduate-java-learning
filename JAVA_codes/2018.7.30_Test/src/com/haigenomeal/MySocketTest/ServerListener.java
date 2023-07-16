package com.haigenomeal.MySocketTest;

import java.io.IOException;
import java.net.*;

import javax.swing.JOptionPane;

public class ServerListener extends Thread
{
	public void run()
	{
		ServerSocket s;
		try {
			s = new ServerSocket(12345);
			while(true)
			{
				Socket sc = s.accept();
				JOptionPane.showMessageDialog(null, "有客户连接到了本地的12345端口。");
				//将Socket传递给新的线程（因为每一次有客户端请求连接12345端口由accept产生的Socket都要和一个单独的客户端通信）
			    new ChatSocket(sc).start();
			    
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
