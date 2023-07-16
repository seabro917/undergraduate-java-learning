package com.haigenomeal.test;

import java.util.EnumMap;

public class EnumMapTest {
	public static void main(String[] args) {
		EnumMap<laopo, String> map = new EnumMap<laopo, String>(laopo.class);
		map.put(laopo.Name,"椎名真白");
		map.put(laopo.Age,"18");
		map.put(laopo.OppaiSize,"36B");
		map.put(laopo.Discription,"别看了我永远喜欢椎名真白.jpg");
		System.out.println(map.size());
	}

}
enum laopo
{
	Name,Age,OppaiSize,Discription;
}
