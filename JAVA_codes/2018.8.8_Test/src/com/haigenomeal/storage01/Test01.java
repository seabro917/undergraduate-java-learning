package com.haigenomeal.storage01;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {

	public static void main(String[] args) {
		ArrayList<LaoPo> list = new ArrayList<LaoPo>();
		LaoPo h1 = new LaoPo("02", 19, "36C", "�ǵ��Ҿ�������darling.jpg");
		LaoPo h2 = new LaoPo("��������", 15, "36A", "Сѧ�����ߣ�");
		LaoPo h3 = new LaoPo("׵�����", 18, "36A", "������������ҵ�ǰ��");
		
		list.add(h1);
		list.add(h2);
		list.add(h3);
		
		Iterator itr = list.iterator();
//		System.out.println("���ҿ�������˭�ֳ�Ϊ���ҵ����š�");
		while(itr.hasNext())
		{
			System.out.println(((LaoPo)(itr.next())).Origin);
		}
		
		
	}
}
