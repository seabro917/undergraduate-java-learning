package com.haigenomeal.myserversocket.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;

public class ChatSocket extends Thread{
	Socket sc;
	public ChatSocket(Socket sc)
	{
		this.sc=sc;
	}
	
	public void out(String out)
	{
		try {
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(sc.getOutputStream()));
			pw.write(out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void run()
	{
		while(true)
		{
			
		}
	}

}
