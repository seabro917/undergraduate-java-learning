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
				JOptionPane.showMessageDialog(null, "�пͻ����ӵ��˱��ص�12345�˿ڡ�");
				//��Socket���ݸ��µ��̣߳���Ϊÿһ���пͻ�����������12345�˿���accept������Socket��Ҫ��һ�������Ŀͻ���ͨ�ţ�
			    new ChatSocket(sc).start();
			    
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
