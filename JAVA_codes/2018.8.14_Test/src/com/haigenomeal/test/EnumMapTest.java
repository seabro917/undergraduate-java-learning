package com.haigenomeal.test;

import java.util.EnumMap;

public class EnumMapTest {
	public static void main(String[] args) {
		EnumMap<laopo, String> map = new EnumMap<laopo, String>(laopo.class);
		map.put(laopo.Name,"׵�����");
		map.put(laopo.Age,"18");
		map.put(laopo.OppaiSize,"36B");
		map.put(laopo.Discription,"��������Զϲ��׵�����.jpg");
		System.out.println(map.size());
	}

}
enum laopo
{
	Name,Age,OppaiSize,Discription;
}
