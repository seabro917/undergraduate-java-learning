package com.haigenomeal.test;

import java.lang.ref.WeakReference;

/**
 * 引用分类：强，软，弱，虚
 * 强与弱引用
 * @author 海哥昨晚没吃饭
 *
 */
public class RefDemo {
	public static void main(String[] args) {
		//字符串常量池
//		String str = "只要是二次元女孩子那么就都是我海某人的老婆请问这句话有什么错误的地方吗？";
		String str = new String("只要是二次元女孩子那么就都是我海某人的老婆请问这句话有什么错误的地方吗？");
		//弱引用管理对象
		WeakReference<String> wr = new WeakReference<String>(str);
		System.out.println("gc运行前："+wr.get());
		//断开引用
		str = null;
		//通知回收
		System.gc();
		System.runFinalization();
		System.out.println("gc运行后："+wr.get());
		
	}
	
}
