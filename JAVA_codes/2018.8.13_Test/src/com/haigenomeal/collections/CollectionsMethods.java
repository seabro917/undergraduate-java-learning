package com.haigenomeal.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> cards = new ArrayList<Integer>();
		List<Integer> p1 = new ArrayList<Integer>();
		List<Integer> p2 = new ArrayList<Integer>();
		List<Integer> p3 = new ArrayList<Integer>();
		List<Integer> last = new ArrayList<Integer>();
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    list.add(4);  //�����Զ�װ��
		
	    System.out.println(list);
	    System.out.println("*****************");
	    System.out.println("����˳���");
	    Collections.swap(list, 1, 3);
	    System.out.println(list);
	    
	    System.out.println("*****************");
	    System.out.println("ģ�ⷢ�ƣ�");
	    for(int i=1;i<55;i++)
	    {
	    	cards.add(i);
	    }
	    Collections.shuffle(cards);
	    for(int i=0;i<51;i+=3)
	    {
	    	p1.add(cards.get(i));
	    	p2.add(cards.get(i+1));
	    	p3.add(cards.get(i+2));
	    }
	    last.add(cards.get(51));
	    last.add(cards.get(52));
	    last.add(cards.get(53));
	    System.out.println("���һ���ƣ�");
	    System.out.println(p1);
	    System.out.println("��Ҷ����ƣ�");
	    System.out.println(p2);
	    System.out.println("��������ƣ�");
	    System.out.println(p3);
	    System.out.println("����Ϊ��");
	    System.out.println(last);
	    
//	    System.out.println("*******************");
//	    Collections.fill(list, 5);
//	    System.out.println(list);
	    
	    System.out.println("*******************");
	    System.out.println(list);
	    Collections.shuffle(list);
	    list.set(2, 100);
	    System.out.println(list);
	    System.out.println(Collections.max(list));
	    
	    System.out.println("*******************");
	    System.out.println(list);
	    Collections.reverse(list);
	    System.out.println(list);
	}
}
