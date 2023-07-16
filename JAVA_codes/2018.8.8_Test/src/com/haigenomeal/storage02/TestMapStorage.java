package com.haigenomeal.storage02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**分拣思想
 * 
 * This is a cat and that is a mouse and where is the food? 
 * 统计每个单词出现的次数？
 * 存储到map中
 * key：String
 * value：自定义类型（不用integer是因为int是final不好改变）
 * 1、 为所有的key创建容器
 *     之后容器中存放对应的value
 * 2、 第一次创建容器，并存放value值
 *     第二次之后直接使用容器存放值
 * @author 海哥昨晚没吃饭
 *
 */
public class TestMapStorage {
	public static void main(String[] args) 
	{
		HashMap<String, Letter> map = new HashMap<String, Letter>();
		String str = "This is a cat and that is a mouse and where is the food? ";
		String[] arr = str.split(" ");
		// 	加强for循环
		for(String temp:arr)
		{
			//1、为所有的key创建容器
			if(!map.containsKey(temp))              
				map.put(temp, new Letter());
			//2、之后容器中存放对应的value
			Letter letter = map.get(temp);             //已经有对应容器的话就不用再创建了，直接拿容器来用即可
			letter.setCount(letter.getCount()+1);;
		}
		//		Letter a = map.get("is");
		//		System.out.println(a.getCount());
		Set<String> set = map.keySet();
		for(String temp:set)
		{
			System.out.println("单词："+temp+"出现的次数为："+map.get(temp).getCount());
		}

	}

}
