package com.haigenomeal.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyDequeTest {
	public static void main(String[] args) {
		Deque<String> que = new ArrayDeque<String>(); 
		
		que.offer("����,");
		que.offer("ֻҪ��");
		que.offer("����ƬС���");
		que.offer("��ô");
		que.offer("���Ǿ�");
		que.offer("һ����");
		que.offer("�������š�");
		que.offer(":)");
		que.offerFirst("�г������գ�");
	
		
		System.out.println(que.peekFirst());
	} 
}
