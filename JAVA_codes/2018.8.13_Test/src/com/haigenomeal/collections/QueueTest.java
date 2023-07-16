package com.haigenomeal.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {	
	public static void main(String[] args) {
		Queue<Request> que = new ArrayDeque<QueueTest.Request>();
		for(int i=0;i<10;i++)
		{
			final int num = i;
			que.offer(new Request(){

				@Override
				public void deposit() {
					System.out.println("第"+num+"个人，办理存款业务，存款额度为："+Math.random()*10000+".");
				}
			});
		}
		QueueTest.DealWith(que);
//		que.peek().deposit();
//		que.poll().deposit();
	}
    
	public static void DealWith(Queue<Request> que)
	{
		Request res = null;
		while((res = que.poll())!=null)
		{
			res.deposit();
		}
	}
	
	
//	interface Customer extends Runnable
//	{
//		void run();
//	}
	
	interface Request
	{
		void deposit();
	}
}
