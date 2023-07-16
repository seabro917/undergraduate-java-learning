package MyCollection;

import java.util.HashMap;

/**
 * HashSet底层实际上就是应用了HashMap里面key值的不可重复，所以Set里面的元素值也是不可重复的。
 * @author 海哥昨晚没吃饭
 *
 */
public class MyHashSet {
	 HashMap map;
	 //这里设置一个静态的Object，作为每一次map存放key的时候对应的vaule。
	 private static final Object PRESENT = new Object();  
	 
	 public MyHashSet()
	 {
		 map = new HashMap();
	 }
	 
	 public void add(Object obj)
	 {
		 map.put(obj, PRESENT);  
		 
	 }

}
