package MyCollection;

import java.util.HashMap;

/**
 * HashSet�ײ�ʵ���Ͼ���Ӧ����HashMap����keyֵ�Ĳ����ظ�������Set�����Ԫ��ֵҲ�ǲ����ظ��ġ�
 * @author ��������û�Է�
 *
 */
public class MyHashSet {
	 HashMap map;
	 //��������һ����̬��Object����Ϊÿһ��map���key��ʱ���Ӧ��vaule��
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
