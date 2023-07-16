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
//				JOptionPane.showMessageDialog(null, "�пͻ����ӵ��˱��ص�12345�˿ڡ�");
				frame.text_mess.append("\n�пͻ����ӵ��˱��ص�12345�˿ڣ��ͻ��Ķ˿ں�Ϊ��"+sc.getPort());
				//��Socket���ݸ��µ��̣߳���Ϊÿһ���пͻ�����������12345�˿���accept������Socket��Ҫ��һ�������Ŀͻ���ͨ�ţ�
			    new ChatSocket(sc).start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}