package com.haigenomeal.MySocketTest;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.*;

public class ChatSocket extends Thread{
	Socket sc;
	public ChatSocket(Socket sc)
	{
		this.sc=sc;
	}
	
	public void run()
	{
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()));
			int count=0;
			while(true)
			{
				bw.write("loop"+count);
				Thread.sleep(1000);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
