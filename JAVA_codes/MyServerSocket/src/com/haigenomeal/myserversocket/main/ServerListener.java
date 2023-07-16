package com.haigenomeal.myserversocket.main;

import java.awt.EventQueue;
import java.io.IOException;
import java.net.*;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import com.haigenomeal.myserversocket.view.MainServer;

public class ServerListener extends Thread
{
	MainServer frame;
	
	public void run()
	{
		ServerSocket s;
		try {
			s = new ServerSocket(12345);
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						frame = new MainServer();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			while(true)
			{
				Socket sc = s.accept();
//				JOptionPane.showMessageDialog(null, "有客户连接到了本地的12345端口。");
				frame.text_mess.append("\n有客户连接到了本地的12345端口，客户的端口号为："+sc.getPort());
				//将Socket传递给新的线程（因为每一次有客户端请求连接12345端口由accept产生的Socket都要和一个单独的客户端通信）
			    new ChatSocket(sc).start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}