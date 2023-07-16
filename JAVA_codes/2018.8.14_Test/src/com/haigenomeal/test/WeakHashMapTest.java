package com.haigenomeal.test;

import java.util.WeakHashMap;

/**
 * WeakHashMap 键为弱类型，gc运行时立即回收
 * @author 海哥昨晚没吃饭
 *
 */
public class WeakHashMapTest {
	public static void main(String[] args) {
		WeakHashMap<String, String> map = new WeakHashMap<String, String>();
		//测试数据
		//常量池对象，不会回收
		map.put("你别搞我啊","rua");
		map.put("都是我老婆","yingyingying");
		//gc运行已被回收
		map.put(new String("嘻嘻嘻"),"你就给老子绿！");
		map.put(new String("嘿嘿嘿"),"rua");
		
		//gc运行 通知回收
		System.gc();
		System.runFinalization();

		System.out.println(map.size());
		
		
	}
    
}
