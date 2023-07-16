package com.haigenomeal.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnmodifiableTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "a1");
		map.put("b", "b1");
		
		Map<String, String> map2 = Collections.unmodifiableMap(map);
//		map2.put("你看这样", "就什么都放不进去了");
		System.out.println(map2.size());
		
		//只包含一个元素的容器
		List<String> list = Collections.singletonList(new String("都是我老婆"));
//		list.add("你看这个list只能放一个元素");
		
	}

	public static Set<String> test(Set<String> set)
	{
		//............
		//操作........
		//............
		//对传入的Set操作完之后再将该Set返回出去
		
		//如果对传入的Set进行一系列操作之后该Set变成空的了传回去的时候可以通过这种方式避免空指针报错
		if(set==null)
		{
			return Collections.EMPTY_SET;  
		}
		return set;
	}
}
