package com.haigenomeal.myclientsocket.main;

import java.util.Vector;

import com.haigenomeal.myserversocket.main.ChatSocket;

public class ClientManager {
	private ClientManager(){}
	public static final ClientManager cm = new ClientManager();
	public static ClientManager getClientManager()
	{
		return cm;
	}

	Vector<ClientSocket> vector = new Vector<ClientSocket>();

	public void add(ClientSockst cs)
	{
		vector.add(cs);
	}

	public void publish(ClientSocket cls,String out)
	{
		for(int i=0;i<vector.size();i++)
		{
			ChatSocket cs_check = vector.get(i);
			if(!cs.equals(cs_check))


		}
