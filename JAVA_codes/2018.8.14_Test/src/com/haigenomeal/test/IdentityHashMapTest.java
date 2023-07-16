package com.haigenomeal.test;

import java.util.IdentityHashMap;

/**
 * 键比较地址去重 （HashMap是比较key的hashcode和equals方法）
 * @author 海哥昨晚没吃饭
 *
 */
public class IdentityHashMapTest {
	public static void main(String[] args) {
		IdentityHashMap<String, String> map = new IdentityHashMap<String, String>();
		
		map.put("a", "a1");
		map.put("a", "a2");
		System.out.println(map.size());
		map.put(new String("a"), "a3");
		map.put(new String("a"), "a4");
		System.out.println(map.size());
//		System.out.println(map.get("a"));
	}
}
