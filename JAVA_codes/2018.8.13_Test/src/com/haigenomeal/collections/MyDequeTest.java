package com.haigenomeal.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyDequeTest {
	public static void main(String[] args) {
		Deque<String> que = new ArrayDeque<String>(); 
		
		que.offer("别看了,");
		que.offer("只要是");
		que.offer("动画片小姐姐");
		que.offer("那么");
		que.offer("她们就");
		que.offer("一定都");
		que.offer("是我老婆。");
		que.offer(":)");
		que.offerFirst("中出日漫痴！");
	
		
		System.out.println(que.peekFirst());
	} 
}
