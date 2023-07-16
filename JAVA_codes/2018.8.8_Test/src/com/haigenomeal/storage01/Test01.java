package com.haigenomeal.storage01;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {

	public static void main(String[] args) {
		ArrayList<LaoPo> list = new ArrayList<LaoPo>();
		LaoPo h1 = new LaoPo("02", 19, "36C", "是的我就是她的darling.jpg");
		LaoPo h2 = new LaoPo("潮留美海", 15, "36A", "小学生赛高！");
		LaoPo h3 = new LaoPo("椎名真白", 18, "36A", "别看了这个就是我的前妻");
		
		list.add(h1);
		list.add(h2);
		list.add(h3);
		
		Iterator itr = list.iterator();
//		System.out.println("让我看看今天谁又成为了我的老婆。");
		while(itr.hasNext())
		{
			System.out.println(((LaoPo)(itr.next())).Origin);
		}
		
		
	}
}
